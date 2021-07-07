package com.example.demo.interfaces;

import java.util.*;

import org.springframework.data.jpa.repository.*;

import com.example.demo.entity.*;

public interface IAdmin extends JpaRepository <User,String> {
//	2) AdminInterface- 
//	Insert(Job, User),
//	Delete(Job, User),
//	(update,Delete,view)UserLog,
//,ViewUser, ViewJob
	
	@Query(value="insert into user(email, password, status) values(?1, ?2, ?3)",nativeQuery=true)
	public boolean insertUser(User user);
	@Query(value="delete from user where userid=?1",nativeQuery=true)
	public boolean deleteUserById(int id);
	@Query(value="select * from user where userid=?1",nativeQuery=true)
	public Optional<User> getUserById(int id);
	
	@Query(value="delete from jobpost where jobId=?1",nativeQuery=true)
	public boolean deleteJobpostById(int id);
	@Query(value="insert into jobpost(jobRole, postedOn, companyName, companyUrl) values(?1, ?2, ?3, ?4)",nativeQuery=true)
	public boolean insertJobpost(Jobpost jobpost);
	@Query(value="select * from jobpost where jobId=?1",nativeQuery=true)
	public Optional<Jobpost> getJobpostById(int id);
	
	@Query(value="update userlog set JobStatus=?1 where userid=?2",nativeQuery=true)
	public boolean updateUserlogStatus(Userlog userlog);
	@Query(value="delete from userlog where userLogId=?1",nativeQuery=true)
	public boolean deleteUserlogById(int id);
	@Query(value="select * from userlog",nativeQuery=true)
	public List<Userlog> getAllUserlogs();
	
	
}
