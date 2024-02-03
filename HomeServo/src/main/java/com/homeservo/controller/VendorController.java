package com.homeservo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.homeservo.dto.Vendor;
import com.homeservo.service.VendorService;
import com.homeservo.util.ResponseStructure;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class VendorController {
	@Autowired
	VendorService vendorService;
	

	@PostMapping("/vendor")
	public ResponseEntity<ResponseStructure<Vendor>> saveVendor(@RequestBody Vendor vendor) {
		return vendorService.saveVendor(vendor);
	}
	
	@GetMapping("/vendorlogin")
	public ResponseEntity<ResponseStructure<Vendor>> login(@RequestParam String email ,@RequestParam String password){
		return vendorService.loginVendor(email, password);
	}
	
	@PutMapping("/vendor")
	public ResponseEntity<ResponseStructure<Vendor>> updateVendor(@RequestBody Vendor vendor) {
		return vendorService.updateVendor(vendor);
	}
	
	@DeleteMapping("/deletevendor")
	public ResponseEntity<ResponseStructure<Vendor>> deleteVendor(@RequestParam int ven_id) {
		return vendorService.deleteVendor(ven_id);
	}
	
	@GetMapping("/vendor")
	public ResponseEntity<ResponseStructure<com.homeservo.duplicate.Vendor>> getById(@RequestParam int id) {
		return vendorService.getById(id);
	}
	
/*	@GetMapping("/vendorall")
	public ResponseEntity<ResponseStructure<List<Vendor>>> getAll(@RequestParam int cus_id) {
		return vendorService.getAll(cus_id);
	} */
	

}
