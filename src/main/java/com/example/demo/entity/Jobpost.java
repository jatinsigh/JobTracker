package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "jobpost")
public class Jobpost {
	@Id
	private int jobId;
	
	@Column
	private String jobRole;
	
	@Column
	private Timestamp postedOn;
	
	@Column
	private String companyName;
	
	@Column
	private String companyUrl;
	
	public Jobpost() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobpost(int jobId, String jobRole, Timestamp postedOn, String companyName, String companyUrl) {
		super();
		this.jobId = jobId;
		this.jobRole = jobRole;
		this.postedOn = postedOn;
		this.companyName = companyName;
		this.companyUrl = companyUrl;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public Timestamp getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Timestamp postedOn) {
		this.postedOn = postedOn;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	@Override
	public String toString() {
		return "Jobpost [jobId=" + jobId + ", jobRole=" + jobRole + ", postedOn=" + postedOn + ", companyName="
				+ companyName + ", companyUrl=" + companyUrl + "]";
	}
	
	
}
