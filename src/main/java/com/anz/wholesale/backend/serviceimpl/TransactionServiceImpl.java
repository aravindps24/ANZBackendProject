package com.anz.wholesale.backend.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.anz.wholesale.backend.beanmapper.AccountMapper;
import com.anz.wholesale.backend.beanmapper.TransactionMapper;
import com.anz.wholesale.backend.config.spring.AppProperties;
import com.anz.wholesale.backend.data.entity.Account;
import com.anz.wholesale.backend.data.entity.Transaction;
import com.anz.wholesale.backend.data.repository.AccountRepo;
import com.anz.wholesale.backend.data.repository.TransactionRepo;
import com.anz.wholesale.backend.domain.AccountTransactions;
import com.anz.wholesale.backend.domain.TransactionSearch;
import com.anz.wholesale.backend.serviceapi.TransactionService;

@Component
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	private TransactionRepo transactionRepo;
	
	@Autowired
	private AccountRepo accountRepo;
	
	@Autowired
	private TransactionMapper transactionMapper;
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Autowired
	private AppProperties appProperties;
	
	public AccountTransactions retrieveAccountTransactions(TransactionSearch search) {
		
		AccountTransactions accountTrxns = new AccountTransactions();
		List<com.anz.wholesale.backend.domain.Transaction> trxnList = new ArrayList<>();

		Pageable pageableRequest = PageRequest.of(search.getPageNumber(), 
				search.getResultsPerPage() == 0 ? appProperties.getResultsPerPage() : search.getResultsPerPage(), 
						Sort.by(search.getSortColumn()).descending());
		
		List<Transaction> transactionsByAccountNumber = 
				transactionRepo.findTransactionByAccountNumberFk
					(pageableRequest, search.getAccountNumber());
		
		Account account = accountRepo.findAccountByAccountNumber(search.getAccountNumber());
		
		if (Optional.ofNullable(transactionsByAccountNumber).isPresent()) {
			for (Transaction acc : transactionsByAccountNumber) {
				trxnList.add(transactionMapper.getTrxnObj(acc));
			}
		}
		accountTrxns.setAccount(accountMapper.getAccountObj(account));
		accountTrxns.setTransactions(trxnList);
		
		return accountTrxns;
	}

}
