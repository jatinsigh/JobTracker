package com.sapient.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sapient.entity.Userskills;

public interface IUserSkillsInterface extends JpaRepository<Userskills, String> {


	   @Query(value="UPDATE userskills set userSkillId=? , userskill=?, userid=? WHERE userid=?", nativeQuery=true)
	   public Userskills updateUserSkill(Userskills userskills);
}
