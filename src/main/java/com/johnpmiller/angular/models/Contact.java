package com.johnpmiller.angular.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {
	@Id
	String id;
	String fname;
	String lname;
	String address;
	String city;
	String phone;
	String email;

	public Contact() {
	}

	public Contact(String fname, String lname, String address, String city, String phone, String email) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFName() {
		return fname;
	}

	public void setFName(String fname) {
		this.fname = fname;
	}
	
	public String getLName() {
		return lname;
	}
	
	public void setLName(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
