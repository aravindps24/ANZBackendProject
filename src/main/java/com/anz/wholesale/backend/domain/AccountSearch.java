package com.anz.wholesale.backend.domain;

import java.io.Serializable;
import java.util.List;

public class AccountSearch extends PageData implements Serializable{

	private static final long serialVersionUID = 6772216018547133719L;

	private long customerId;
	private String customerName;
	private List<String> accounts;
	
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<String> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "AccountSearch [customerId=" + customerId + ", customerName=" + customerName + ", accounts=" + accounts
				+ "]";
	}
	
}
