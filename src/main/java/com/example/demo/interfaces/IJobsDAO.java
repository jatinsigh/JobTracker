package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Jobpost;

@Repository
public interface IJobsDAO extends JpaRepository<Jobpost, Integer> {
	
	// Already Created Function
//	public List<Jobpost> findAll();
	
	// Getting job by id
	// public Jobpost findByJobpostId(int jobid);

}
