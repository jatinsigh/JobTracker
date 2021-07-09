package com.example.demo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Jobpost;

@Repository
public interface IJobsDAO extends JpaRepository<Jobpost, Integer> {
	// Already Created Function
//	public List<Jobpost> findAll();
	
	// Getting job by id
	// public Jobpost findByJobpostId(int jobid);

	// Detailed view of job
	@Query(value = "select a.jobRole,a.postedOn,a.companyName,a.companyUrl,b.jobSkill from jobpost a join jobSkills b on a.jobid=b.jobid and a.jobid= :jobid ;", nativeQuery = true)
	public List<String> getDetailedJobView(@Param("jobid") int jobid);

	@Query(value = "select c.* from jobPost c join (select a.* from jobskills a join (select * from userskills where userid= :userid) b on a.jobSkill=b.skills) d on c.jobId=d.jobId ;", nativeQuery = true)
	public List<String> getRelevantJobsForUser(@Param("userid") int userid);
}
