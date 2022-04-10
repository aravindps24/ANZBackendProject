package com.anz.wholesale.backend.data.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anz.wholesale.backend.data.entity.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {

	public List<Transaction> findTransactionByAccountNumberFk(@Param("accountNumber") long accountNumber);
	
	public List<Transaction> findTransactionByAccountNumberFk
								(Pageable pageableRequest, @Param("accountNumber") long accountNumber);
	
}
