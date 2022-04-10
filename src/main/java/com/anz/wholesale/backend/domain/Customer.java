package com.anz.wholesale.backend.domain;

import java.io.Serializable;

public class Customer implements Serializable{

	private static final long serialVersionUID = 5535507419465878165L;

	private long customerId;
	private String firstName;
	private String lastName;
	private String classification;
	private Address address;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	Address getAddress() {
		return address;
	}
	void setAddress(Address address) {
		this.address = address;
	}
	long getCustomerId() {
		return customerId;
	}
	void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", classification=" + classification + ", address=" + address + "]";
	}
	
}
