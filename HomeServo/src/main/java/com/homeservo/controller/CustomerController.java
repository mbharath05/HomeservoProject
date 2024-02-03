package com.homeservo.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homeservo.dto.Customer;
import com.homeservo.repository.CustomerRepository;
import com.homeservo.service.CustomerService;
import com.homeservo.util.ResponseStructure;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	
	@PostMapping("/customer")
	public ResponseEntity<ResponseStructure<Customer>> saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customerlogin")
	public ResponseEntity<ResponseStructure<Customer>> login(@RequestParam String email ,@RequestParam String password){
		return customerService.login(email, password);
	}
	
	@PutMapping("/updatecustomer")
	public ResponseEntity<ResponseStructure<Customer>> updateCustomer( @RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}

	
	@DeleteMapping("/customer")
	public ResponseEntity<ResponseStructure<Customer>> deleteCustomer(@RequestParam int cus_id) {
		return customerService.deleteCustomer(cus_id);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<ResponseStructure<com.homeservo.duplicate.Customer>> getById(@RequestParam int cus_id){
		return customerService.getById(cus_id);
	}

	

	/*@GetMapping("/customers")
	public java.util.List<Customer> viewAllCustomers() {
	return customerService.viewAll();
	}*/
	

}
