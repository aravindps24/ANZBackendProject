package com.anz.wholesale.backend.domain;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long serialVersionUID = -8149654014450048746L;

	private String addresslineOne;
	private String addresslineTwo;
	private String city;
	private String state;
	private String pincode;
	
	public String getAddresslineOne() {
		return addresslineOne;
	}
	public void setAddresslineOne(String addresslineOne) {
		this.addresslineOne = addresslineOne;
	}
	public String getAddresslineTwo() {
		return addresslineTwo;
	}
	public void setAddresslineTwo(String addresslineTwo) {
		this.addresslineTwo = addresslineTwo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addresslineOne=" + addresslineOne + ", addresslineTwo=" + addresslineTwo + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}
