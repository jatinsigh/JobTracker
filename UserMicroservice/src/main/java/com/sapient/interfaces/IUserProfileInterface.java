package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.entity.Userprofile;

public interface IUserProfileInterface extends JpaRepository <Userprofile, String>{

}
