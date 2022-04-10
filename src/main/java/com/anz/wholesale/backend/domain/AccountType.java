package com.anz.wholesale.backend.domain;

public enum AccountType {

	SAVING("Savings"), 
	CURRENT("Current"),
	;

	private String desc;

	String getDesc() {
		return desc;
	}

	void setDesc(String desc) {
		this.desc = desc;
	}

	AccountType(String text) {
		this.desc = text;
	}

}
