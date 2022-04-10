package com.anz.wholesale.backend.domain;

public enum Currency {

	SCG("Singapore Dollar"),
	AUD("Australian Dollar")
	;
	
	
	String desc;
	Currency(String desc) {
		this.desc = desc;
	}
	String getDesc() {
		return desc;
	}
	void setDesc(String desc) {
		this.desc = desc;
	}

	
}
