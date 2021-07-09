package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Jobpost;
import com.example.demo.interfaces.IJobsDAO;

@RestController
@RequestMapping("/Jobs")
public class JobPostController {

	@Autowired
	IJobsDAO jobdao;

	@GetMapping("")
	public String getStartedWithMongo() {
		return "Welcome to view Jobs";
	}

	@GetMapping("/alljobs")
	public List<Jobpost> getAllJobs() {
		return jobdao.findAll();
	}

	@GetMapping("/job/{jobId}")
	public List<String> getDetailJobView(@PathVariable Integer jobId) {
		return jobdao.getDetailedJobView(jobId);
	}

	@GetMapping("/job/userid/{userid}")
	public List<String> getRelevantJobs(@PathVariable Integer userid) {
		return jobdao.getRelevantJobsForUser(userid);
	}

}
