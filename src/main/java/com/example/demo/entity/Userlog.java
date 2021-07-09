package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userlog")
public class Userlog {
	@Id
	private int userLogid;
	
	@Column
	private Timestamp applyDate;
	
	@Column
	private String JobStatus;
	
	@Column
	private int JobId;
	
	@Column
	private int userid;
	public Userlog(int userLogid, Timestamp applyDate, String jobStatus, int jobId, int userid) {
		super();
		this.userLogid = userLogid;
		this.applyDate = applyDate;
		JobStatus = jobStatus;
		JobId = jobId;
		this.userid = userid;
	}
	public Userlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserLogid() {
		return userLogid;
	}
	public void setUserLogid(int userLogid) {
		this.userLogid = userLogid;
	}
	public Timestamp getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Timestamp applyDate) {
		this.applyDate = applyDate;
	}
	public String getJobStatus() {
		return JobStatus;
	}
	public void setJobStatus(String jobStatus) {
		JobStatus = jobStatus;
	}
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int jobId) {
		JobId = jobId;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Userlog [userLogid=" + userLogid + ", applyDate=" + applyDate + ", JobStatus=" + JobStatus + ", JobId="
				+ JobId + ", userid=" + userid + "]";
	}
	

}
