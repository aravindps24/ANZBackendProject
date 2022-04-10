package com.anz.wholesale.backend.domain;

import java.io.Serializable;

public class TransactionSearch extends PageData implements Serializable{

	private static final long serialVersionUID = 6772216018547133719L;

	private long customerId;
	private long accountNumber;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "TransactionSearch [customerId=" + customerId + ", accountId=" + accountNumber + "]";
	}
	
}
