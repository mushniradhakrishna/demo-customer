package com.demo.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.model.CustomerDocument;
import com.demo.customer.service.DemoCustomerService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/demo")
public class DemoCustomerController {

	@Autowired
	private DemoCustomerService demoCustomerService;
	
	@GetMapping("/customer/all")
	public List<CustomerDocument> getCustomerAll() {
		return demoCustomerService.getCustomerAll();
	}

	@PostMapping("/customer")
	public String createCustomer(@RequestBody CustomerDocument customer) {
		return demoCustomerService.createCustomer(customer);
	}

	@GetMapping("/customer/{customerId}")
	public Optional<CustomerDocument> getCustomer(@PathVariable String customerId) {
		return demoCustomerService.getCustomer(customerId);
	}
	
	@GetMapping("/customerByEmail/{email}")
	public Optional<CustomerDocument> getCustomerByEmail(@PathVariable String email) {
		return demoCustomerService.getCustomerByEmail(email);
	}

	@PutMapping("/customer")
	public String updateCustomer(@RequestBody CustomerDocument customer) {
		return demoCustomerService.updateCustomer(customer);
	}

	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomer(@PathVariable String customerId) {
		return demoCustomerService.deleteCustomer(customerId);
		
	}

}