package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
 @Id
 private int userid;
 
 @Column
 private String email;
 
 @Column
 private String password;
 
 @Column
 private String status;
public User(int userid, String email, String password, String status) {
	super();
	this.userid = userid;
	this.email = email;
	this.password = password;
	this.status = status;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", email=" + email + ", password=" + password + ", status=" + status + "]";
}
 
}
