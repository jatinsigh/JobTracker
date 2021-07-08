package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Jobpost;
import com.example.demo.entity.User;
import com.example.demo.interfaces.IAdmin;
import com.example.demo.interfaces.IJobsDAO;

@RestController
public class JobPostController {

	@Autowired
	IJobsDAO jobdao;

	@Autowired
	IAdmin admindao;

	@GetMapping("/")
	public String getStartedWithMongo() {
		return "Mongo is started in spring boot";
	}

	@GetMapping("/alljobs")
	public List<Jobpost> getAllJobs() {
		return jobdao.findAll();
	}


	@GetMapping("/alljobs")
	public Boolean getsSaveUser(@RequestBody User user) {
		return admindao.save(user);
	}

	@GetMapping("/job/{jobId}")
	public Optional<Jobpost> getJobById(@PathVariable Integer jobId) {
		return jobdao.findById(jobId);
	}

}
