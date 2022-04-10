package com.anz.wholesale.backend.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction implements Serializable{

	private static final long serialVersionUID = -5386675638377657424L;

	private long transactionId;
	private long accountNumber;
	private LocalDateTime valueDate;
	private BigDecimal debitAmount;
	private BigDecimal creditAmount;
	private TransactionType transactionType;
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public LocalDateTime getValueDate() {
		return valueDate;
	}
	public void setValueDate(LocalDateTime valueDate) {
		this.valueDate = valueDate;
	}
	public BigDecimal getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(BigDecimal debitAmount) {
		this.debitAmount = debitAmount;
	}
	public BigDecimal getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}
	public TransactionType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", accountNumber=" + accountNumber + ", valueDate="
				+ valueDate + ", debitAmount=" + debitAmount + ", creditAmount=" + creditAmount + ", transactionType="
				+ transactionType + "]";
	}
	
}
