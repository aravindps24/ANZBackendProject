package com.anz.wholesale.backend.serviceapi;

import com.anz.wholesale.backend.domain.AccountTransactions;
import com.anz.wholesale.backend.domain.TransactionSearch;

public interface TransactionService {

	public AccountTransactions retrieveAccountTransactions(TransactionSearch search);
	
}
