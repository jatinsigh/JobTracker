package com.example.demo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Userlog;

public interface IUserlog extends JpaRepository <Userlog,Integer>{
	@Query(value="update userlog set JobStatus=?1 where userLogid=?2",nativeQuery=true)
	public boolean updateUserlogStatus(int userLogid);
}
