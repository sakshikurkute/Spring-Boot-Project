package com.MedManagement.service;

import java.util.List;

import com.MedManagement.entity.Customer;
import com.MedManagement.model.CustomerDTO;


public interface CustomerService {
	
	String addCustomer(Customer customer);
	CustomerDTO getCustomerById(int id);
	List<CustomerDTO> getAllCustomer();
	CustomerDTO updateCustomer(int id,Customer customer);
	

}
