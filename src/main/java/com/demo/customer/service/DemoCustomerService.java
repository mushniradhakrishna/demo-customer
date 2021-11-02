package com.demo.customer.service;

import java.util.List;
import java.util.Optional;

import com.demo.customer.model.CustomerDocument;

public interface DemoCustomerService {

	public String createCustomer(CustomerDocument main);

	public Optional<CustomerDocument> getCustomer(String demoId);

	public String updateCustomer(CustomerDocument main);

	public String deleteCustomer(String demoId);

	public List<CustomerDocument> getCustomerAll();

	public Optional<CustomerDocument> getCustomerByEmail(String email);

}
