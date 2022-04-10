package com.anz.wholesale.backend.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.anz.wholesale.backend.beanmapper.AccountMapper;
import com.anz.wholesale.backend.beanmapper.CustomerMapper;
import com.anz.wholesale.backend.config.spring.AppProperties;
import com.anz.wholesale.backend.data.entity.Account;
import com.anz.wholesale.backend.data.entity.Customer;
import com.anz.wholesale.backend.data.repository.AccountRepo;
import com.anz.wholesale.backend.data.repository.CustomerRepo;
import com.anz.wholesale.backend.domain.AccountSearch;
import com.anz.wholesale.backend.domain.CustomerAccounts;
import com.anz.wholesale.backend.serviceapi.AccountsService;

@Component
public class AccountServiceImpl implements AccountsService{

	Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private AppProperties appProperties;
	
	public CustomerAccounts retrieveCustomerAccounts(AccountSearch search) {
		
		logger.info("retrieveCustomerAccounts Start");
		
		CustomerAccounts accounts = new CustomerAccounts();
		List<com.anz.wholesale.backend.domain.Account> accList = new ArrayList<>();

		Pageable pageableRequest = PageRequest.of(search.getPageNumber(), 
				search.getResultsPerPage() == 0 ? appProperties.getResultsPerPage() : search.getResultsPerPage(), 
						Sort.by(search.getSortColumn()).descending());
		logger.debug(pageableRequest.toString());
		List<Account> accountByCustomerId = accountRepo.findAccountsByCustomerIdFk(pageableRequest, search.getCustomerId());
		Customer customerByCustomerId = customerRepo.findCustomerByCustomerId(search.getCustomerId());
		logger.debug(customerByCustomerId.toString());
		
		if (Optional.ofNullable(accountByCustomerId).isPresent()) {
			for (Account acc : accountByCustomerId) {
				accList.add(accountMapper.getAccountObj(acc));
			}
		}
		accounts.setAccountList(accList);
		accounts.setCustomerInfo(customerMapper.getAccountObj(customerByCustomerId));
		
		logger.info("retrieveCustomerAccounts End");
		return accounts;
	}

}
