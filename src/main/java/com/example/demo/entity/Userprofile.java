package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Userprofile {

	@Id
	private int userid;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String MobileNumber;
	
	@Column
	private int workExperience;
	public Userprofile(int userid, String firstName, String lastName, String mobileNumber, int workExperience) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		MobileNumber = mobileNumber;
		this.workExperience = workExperience;
	}
	public Userprofile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public int getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}
	@Override
	public String toString() {
		return "Userprofile [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", MobileNumber=" + MobileNumber + ", workExperience=" + workExperience + "]";
	}
	
}
