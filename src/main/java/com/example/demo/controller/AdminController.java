package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Jobpost;
import com.example.demo.entity.User;
import com.example.demo.entity.Userlog;
import com.example.demo.interfaces.IAdmin;
import com.example.demo.interfaces.IJobsDAO;
import com.example.demo.interfaces.IUserlog;

@RestController
@RequestMapping(value="/admin")
@CrossOrigin
public class AdminController {

	@Autowired
	IJobsDAO jobdao;

	@Autowired
	IAdmin admindao;
	
	@Autowired
	IUserlog userlogdao;
	
//	@PostMapping(value="/addstudent")
////	public Student saveStudent(@RequestBody Student student){
//		return StudentDao.save(student);
//	}
	
	
//	#1)insert user			--> done 
//	#2)deleteUserbyId		--> done
//	#3)select user by Id	--> done
//	#4)delete job post by id --> done
//	#5)insert job post		--> done
//	#6)get job post by id	-->done
//	#7)update user log status	--> dao
//	#8)delete user log by id	-->dao
//	#9)get all user logs		-->dao
	
	
	
	@GetMapping("/")
	public String getStartedWithMongo() {
		return "Welcome to Admin";
	}

	@GetMapping("/alljobs")
	public List<Jobpost> getAllJobs() {
		return jobdao.findAll();
	}

//	#1)insert user
	@PostMapping("/user/add")
	public User insertUser(@RequestBody User user) {
		return admindao.save(user);
	}
//	#2)deleteUserbyId
	@DeleteMapping(value="/user/delete/{id}")
	public void deleteUser(@PathVariable Integer id) {
		admindao.deleteById(id);
	}
//	#3)select user by Id
	@GetMapping(value="/user/id/{id}")
	public Optional<User> readUser(@PathVariable Integer id){
		return admindao.findById(id);
	}
	
//	#4)delete job post by id
	@DeleteMapping(value="/jobpost/delete/{id}")
	public void deleteJobpost(@PathVariable int id) {
		jobdao.deleteById(id);
	}

//	#5)insert job post
	@PostMapping("/jobpost/add")
	public Jobpost insertJobpost(@RequestBody Jobpost jobpost) {
		return jobdao.save(jobpost);
	}


//	#6)get job post by id	
	@GetMapping(value="/jobpost/id/{id}")
	public Optional<Jobpost> getJobPostById(@PathVariable int id){
		return jobdao.findById(id);
	}
	
//	#7)update user log status
	@PutMapping(value="/userlog/update/{id}")
	public boolean updateJobPostByUserId(@PathVariable int id) {
		return userlogdao.updateUserlogStatus(id);
	}
	
//	#8)delete user log by id
	@DeleteMapping(value="/userlog/delete/{id}")
	public void deleteUserLog(@PathVariable Integer id) {
		userlogdao.deleteById(id);
	}
//	#9)get all user logs
	
	@GetMapping(value="/userlogs")
	public List<Userlog> getAllUserLogs(){
		return userlogdao.findAll();
	}
	
	

}
