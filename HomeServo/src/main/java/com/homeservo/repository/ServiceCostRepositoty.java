package com.homeservo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeservo.dto.ServiceCost;

public interface ServiceCostRepositoty extends JpaRepository<ServiceCost, Integer> {

}
