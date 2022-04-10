package com.anz.wholesale.backend.data.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.backend.data.entity.Account;

@Repository
public interface AccountRepo extends PagingAndSortingRepository<Account, Long> {

	public List<Account> findAccountsByCustomerCustomerId(@Param("customerId") long customerId);
	
	public Account findAccountByAccountNumber(@Param("accountId") long accountId);
	
	public List<Account> findAccountsByCustomerIdFk(Pageable pageableRequest, @Param("accountId") long accountId);
}
