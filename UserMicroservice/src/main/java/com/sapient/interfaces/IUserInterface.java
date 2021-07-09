package com.sapient.interfaces;
import com.sapient.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IUserInterface extends JpaRepository<User, String>{
	
	 
	// @Query(value="SELECT jobId, jobRole, postedOn, companyName from jobPost a
	// NATURAL JOIN jobSkills b JOIN userSkills c WHERE c.userskills = a.jobskill
	// WHERE c.userid=?", nativeQuery=true)
	// public List<Jobpost> viewRelevantJobsByUserId(int userid);
		
	      
		   
	     // @Query(value="SELECT * FROM userLog", nativeQuery= true)
		  //public List<Userlog> viewAllUserLogs();
//		  
//		  @Query(value= "SELECT * FROM userLog where userid= ?", nativeQuery= true)
//		  public List<Userlog> viewUserLogsByUserId(int userid);
//		  
//		  @Query(value= "SELECT * FROM userLog where userLogId= ?", nativeQuery=true)
//		  public List<Userlog> viewUserLogsByUserLogId(int userLogId);
//
//	  @Query(value="INSERT INTO user values (?, ?, ?, ?)", nativeQuery=true)
//	    public List<User> insertUser(int userid, String email, String password, String status);
//	  
//	  @Query(value="INSERT INTO profile values (?, ?, ?, ?, ?)", nativeQuery=true)
//	    public List<User> insertUserProfile (Userprofile userprofile);
//	  
//	  @Query(value="INSERT INTO userskills values (?, ?, ?)", nativeQuery=true)
//	    public List<User> insertUserSkills(Userskills userskills);
//	  
//	  @Query(value="INSERT INTO userlog values (?, ?, ?, ?)", nativeQuery= true )
//	  public Userlog insertJobApplicationInUserLog(int userLogId, Timestamp applyDate, int jobId, String jobStatus, int userid);
//	  
	  @Query(value="UPDATE user set userid=? , email= ? , password= ? , status=? where userid= ?", nativeQuery= true)
	  public User updateUser(User user);
	 
	   @Query(value="UPDATE Profile set userid=?, firstname=?, lastname=?, mobilenumber=?, workExperience=? where userid=?", nativeQuery=true)
	   public Userprofile updateUserProfile(Userprofile userprofile);
	   
	   @Query(value="UPDATE userskills set userSkillId=? , userskill=?, userid=? WHERE userid=?", nativeQuery=true)
	   public Userskills updateUserSkill(Userskills userskills);
	  
		// @Query(value="DELETE FROM user WHERE userid= ? ", nativeQuery=true)
		// public List<User> deleteUser(int userid);
	  
	 
	   
	   
	
	  
	  
}
