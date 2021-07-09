package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.entity.Userskills;

public interface IUserSkillsInterface extends JpaRepository<Userskills, String> {

}
