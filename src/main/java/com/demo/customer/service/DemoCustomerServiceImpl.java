package com.demo.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.exception.EmailNotFoundException;
import com.demo.customer.model.CustomerDocument;
import com.demo.customer.repository.DemoCustomerRepository;

@Service
@Transactional
public class DemoCustomerServiceImpl implements DemoCustomerService{
	
	@Autowired
	private DemoCustomerRepository demoCustomerRepository;
	
	@Override
	public List<CustomerDocument> getCustomerAll(){
		return demoCustomerRepository.findAll();
	}

	@Override
	public String createCustomer(CustomerDocument customer) {
		demoCustomerRepository.save(customer);
		return "Created";
	}

	@Override
	public Optional<CustomerDocument> getCustomer(String customerId) {

		return demoCustomerRepository.findById(customerId);
	}

	@Override
	public String updateCustomer(CustomerDocument customer) {
		demoCustomerRepository.save(customer);
		return "Updated";
	}

	@Override
	public String deleteCustomer(String customerId) {
		demoCustomerRepository.deleteById(customerId);
		return "Deleted";
	}

	@Override
	public Optional<CustomerDocument> getCustomerByEmail(String email) {
		Optional<CustomerDocument> customer = demoCustomerRepository.findByEmail(email);
		if (!customer.isPresent()) {
			throw new EmailNotFoundException("Email not found");
		}
		return customer;
	}

}
