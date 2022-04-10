package com.anz.wholesale.backend.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "address")
public class Address implements Serializable{

	private static final long serialVersionUID = -8149654014450048746L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id", nullable = false, unique = true, updatable = false)
	private long addressId;
	
	@Column(name = "addr_line_one", nullable = false)
	private String addresslineOne;
	
	@Column(name = "addr_line_two", nullable = false)
	private String addresslineTwo;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "pincode", nullable = false)
	private String pincode;
	
	@ManyToOne()
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;
	
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
		return "Address [addressId=" + addressId + ", addresslineOne=" + addresslineOne + ", addresslineTwo="
				+ addresslineTwo + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", customer="
				+ customer + "]";
	}
	
}
