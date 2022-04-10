package com.anz.wholesale.backend.domain;

public enum TransactionType {

	CREDIT("Credit"), 
	DEBIT("Debit"),
	;

	private String desc;

	String getDesc() {
		return desc;
	}

	void setDesc(String desc) {
		this.desc = desc;
	}

	TransactionType(String text) {
		this.desc = text;
	}

}
