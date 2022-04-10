package com.anz.wholesale.backend.data.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Clob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "transaction")
public class Transaction implements Serializable{

	private static final long serialVersionUID = -5386675638377657424L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id", nullable = false, unique = true, updatable = false)
	private long transactionId;
	
	@ManyToOne()
	@JoinColumn(name = "account_number", nullable = false)
	private Account account;
	
	@Column(name = "account_number", nullable = false, updatable = false, insertable = false)
	private long accountNumberFk;
	
	@Column(name = "value_date", nullable = false)
	private LocalDateTime valueDate;
	
	@Column(name = "debit_amount")
	private BigDecimal debitAmount;
	
	@Column(name = "credit_amount")
	private BigDecimal creditAmount;
	
	@Column(name = "trxn_type", nullable = false)
	private String transactionType;
	
	@Column(name = "trxn_remarks")
	private Clob transactionRemarks;
	
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
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", account=" + account + ", accountNumberFk="
				+ accountNumberFk + ", valueDate=" + valueDate + ", debitAmount=" + debitAmount + ", creditAmount="
				+ creditAmount + ", transactionType=" + transactionType + ", transactionRemarks=" + transactionRemarks
				+ "]";
	}
	
}
