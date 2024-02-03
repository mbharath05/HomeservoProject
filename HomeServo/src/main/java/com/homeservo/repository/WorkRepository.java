package com.homeservo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.homeservo.dto.Work;

public interface WorkRepository extends JpaRepository<Work, Integer> {
	@Query("Select a from Work a where a.startDate=null or a.cost=null ")
	public List<Work> listOfWorks();
}
