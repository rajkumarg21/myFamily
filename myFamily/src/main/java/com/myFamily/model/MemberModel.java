package com.myFamily.model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.myFamily.entities.MemberAddress;

/*
 * Name: Rajkumar Saad
 * Date: 03/05/2024
 */

public class MemberModel {

	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private Date dob;
	private String email;
	private String phoneNumber;
	private String profession;
	@JsonIgnore
	private List<MemberAddress> addresses;

	public MemberModel() {
		super();
	}

	public MemberModel(String firstName, String lastName, String gender, String age, Date dob, String email,
			String phoneNumber, String profession, List<MemberAddress> addresses) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.profession = profession;
		this.addresses = addresses;
	}

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public List<MemberAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<MemberAddress> addresses) {
		this.addresses = addresses;
	}

}
