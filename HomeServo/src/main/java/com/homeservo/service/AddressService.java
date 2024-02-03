package com.homeservo.service;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.homeservo.Exception.NoSuchElementFoundInCustomer;
import com.homeservo.Exception.NoSuchIdFoundInAddress;
import com.homeservo.dao.AddressDao;
import com.homeservo.dto.Address;
import com.homeservo.dto.Customer;
import com.homeservo.util.ResponseStructure;

@Service
public class AddressService {
	@Autowired
	AddressDao addressDao;
	public ResponseEntity<ResponseStructure<Address>> updateAddress(Address address){
		Address address2= addressDao.getById(address.getId());
		if(address2!=null) {
			ResponseStructure<Address> responseStructure = new ResponseStructure<>();
			responseStructure.setData(addressDao.updateAddress(address));
			responseStructure.setMessage("Address  updated successfully");
			responseStructure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<Address>>(responseStructure, HttpStatus.FOUND);
		}
		else {
			throw new NoSuchIdFoundInAddress("please check the id in Address");
		}
	}
	public ResponseEntity<ResponseStructure<Address>> getById(int id) {
		Address address=  addressDao.getById(id);
		if (address != null) {
			ResponseStructure<Address> responseStructure = new ResponseStructure<>();
			responseStructure.setData(address);
			responseStructure.setMessage("address find successfully");
			responseStructure.setStatus(HttpStatus.FOUND.value());

			return new ResponseEntity<ResponseStructure<Address>>(responseStructure, HttpStatus.FOUND);
		} else {
			throw new NoSuchIdFoundInAddress("Please check the id properly");
		}

	}

}
