package com.anz.wholesale.backend.serviceapi;

import com.anz.wholesale.backend.domain.AccountSearch;
import com.anz.wholesale.backend.domain.CustomerAccounts;

public interface AccountsService {

	public CustomerAccounts retrieveCustomerAccounts(AccountSearch search);
	
}
