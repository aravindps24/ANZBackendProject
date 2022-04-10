package com.anz.wholesale.backend.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.hateoas.RepresentationModel;

public class AccountTransactions extends RepresentationModel<AccountTransactions> 
												implements Serializable {

	private static final long serialVersionUID = -8366294495827983739L;

	private Account account;
	private List<Transaction> transactions;

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccountTransactions [account=" + account + ", transactions=" + transactions + "]";
	}
	
}
