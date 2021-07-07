package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobskills")
public class Jobskills {
	
	@Id
	private int jobSkillId;
	
	@Column
	private String jobSkill;
	
	@Column
	private int jobId;
	
	public Jobskills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jobskills(int jobSkillId, String jobSkill, int jobId) {
		super();
		this.jobSkillId = jobSkillId;
		this.jobSkill = jobSkill;
		this.jobId = jobId;
	}

	public int getJobSkillId() {
		return jobSkillId;
	}

	public void setJobSkillId(int jobSkillId) {
		this.jobSkillId = jobSkillId;
	}

	public String getJobSkill() {
		return jobSkill;
	}

	public void setJobSkill(String jobSkill) {
		this.jobSkill = jobSkill;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "Jobskills [jobSkillId=" + jobSkillId + ", jobSkill=" + jobSkill + ", jobId=" + jobId + "]";
	}
	

}
