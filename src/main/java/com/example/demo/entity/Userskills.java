package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userskills")
public class Userskills {
 @Id
 private int userSkillid;
 
 @Column
 private String skills;
 
 @Column
 private int userid;
public Userskills(int userSkillid, String skills, int userid) {
	super();
	this.userSkillid = userSkillid;
	this.skills = skills;
	this.userid = userid;
}
public Userskills() {
	super();
	// TODO Auto-generated constructor stub
}
public int getUserSkillid() {
	return userSkillid;
}
public void setUserSkillid(int userSkillid) {
	this.userSkillid = userSkillid;
}
public String getSkills() {
	return skills;
}
public void setSkills(String skills) {
	this.skills = skills;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
@Override
public String toString() {
	return "Userskills [userSkillid=" + userSkillid + ", skills=" + skills + ", userid=" + userid + "]";
}

 
}
