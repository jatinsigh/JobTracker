package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;
import com.example.demo.entity.Userlog;

public interface IAdmin extends JpaRepository <User,Integer> {
//	2) AdminInterface- 
//	Insert(Job, User),
//	Delete(Job, User),
//	(update,Delete,view)UserLog,
//,ViewUser, ViewJob
	
//	#1)insert user
//	#2)deleteUserbyId
//	#3)select user by Id
//	#4)delete job post by id
//	#5)insert job post
//	#6)get job post by id
//	#7)update user log status
//	#8)delete user log by id
//	#9)get all user logs
	
	// @Query(value="insert into user(email, password, status) values(?1, ?2,
	// ?3)",nativeQuery=true)
	// public boolean insertUser(User user);
	// @Query(value="delete from user where userid=?1",nativeQuery=true)
	// public boolean deleteUserById(int id);
	// @Query(value="select * from user where userid=?1",nativeQuery=true)
	// public Optional<User> getUserById(int id);
	
	// @Query(value="delete from jobpost where jobId=?1",nativeQuery=true)
	// public boolean deleteJobpostById(int id);
//	@Query(value="insert into jobpost(jobRole, postedOn, companyName, companyUrl) values(?1, ?2, ?3, ?4)",nativeQuery=true)
//	public boolean insertJobpost(Jobpost jobpost);
//	@Query(value="select * from jobpost where jobId=?1",nativeQuery=true)
//	public Optional<Jobpost> getJobpostById(int id);
//	
	
	// @Query(value="delete from userlog where userLogId=?1",nativeQuery=true)
	// public boolean deleteUserlogById(int id);
//	@Query(value="select * from userlog",nativeQuery=true)
//	public List<Userlog> getAllUserlogs();
	
	
}
