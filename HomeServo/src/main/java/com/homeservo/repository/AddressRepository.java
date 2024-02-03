package com.homeservo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeservo.dto.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
