package com.anz.wholesale.backend.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "account")
public class Account implements Serializable{

	private static final long serialVersionUID = 2268430494740487601L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number", nullable = false, unique = true, updatable = false)
	private long accountNumber;
	
	@ManyToOne()
	@JoinColumn(name="customer_id", nullable = false)
	private Customer customer;
	
	@Column(name = "customer_id", nullable = false, updatable = false, insertable = false)
	private long customerIdFk;
	
	@OneToMany(mappedBy = "account")
	private List<Transaction> transactions;
	
	@Column(name = "account_name", nullable = false)	
	private String accountName;
	
	@Column(name = "account_type", nullable = false)
	private String accountType;
	
	@Column(name = "balance_date")
	private LocalDateTime balanceDate;
	
	@Column(name = "currency", nullable = false)
	private String currency;
	
	@Column(name = "opening_avail_bal")
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
	public LocalDateTime getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(LocalDateTime balanceDate) {
		this.balanceDate = balanceDate;
	}
	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customer=" + customer + ", customerIdFk=" + customerIdFk
				+ ", transactions=" + transactions + ", accountName=" + accountName + ", accountType=" + accountType
				+ ", balanceDate=" + balanceDate + ", currency=" + currency + ", openingBalance=" + openingBalance
				+ "]";
	}
	
}
