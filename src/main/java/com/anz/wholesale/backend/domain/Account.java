package com.anz.wholesale.backend.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account implements Serializable{

	private static final long serialVersionUID = 2268430494740487601L;

	private long accountNumber;
	private long customerId;
	private String accountName;
	private AccountType accountType;
	private LocalDateTime balanceDate;
	private Currency currency;
	private BigDecimal openingBalance;

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	public LocalDateTime getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(LocalDateTime balanceDate) {
		this.balanceDate = balanceDate;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerId=" + customerId + ", accountName=" + accountName
				+ ", accountType=" + accountType + ", balanceDate=" + balanceDate + ", currency=" + currency
				+ ", openingBalance=" + openingBalance + "]";
	}
	
}
