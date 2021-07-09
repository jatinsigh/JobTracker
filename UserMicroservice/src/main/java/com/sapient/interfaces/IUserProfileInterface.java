package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import com.sapient.entity.Userprofile;

public interface IUserProfileInterface extends JpaRepository <Userprofile, String>{

	 @Query(value="UPDATE Profile set userid=?, firstname=?, lastname=?, mobilenumber=?, workExperience=? where userid=?", nativeQuery=true)
	   public Userprofile updateUserProfile(Userprofile userprofile);
	   
}
