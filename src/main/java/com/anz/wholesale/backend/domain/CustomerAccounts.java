package com.anz.wholesale.backend.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class CustomerAccounts extends RepresentationModel<CustomerAccounts> implements Serializable {

	private static final long serialVersionUID = -8974569798586021429L;

	private List<Account> accountList;
	private Customer customerInfo;
	
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	public Customer getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CustomerAccounts [accountList=" + accountList + ", customerInfo=" + customerInfo + "]";
	}
	
}
