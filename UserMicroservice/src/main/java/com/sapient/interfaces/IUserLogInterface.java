package com.sapient.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.entity.Userlog;

public interface IUserLogInterface extends JpaRepository <Userlog, String>{

	
}
