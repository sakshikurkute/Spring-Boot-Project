package com.MedManagement.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedManagement.entity.Customer;
import com.MedManagement.model.CustomerDTO;
import com.MedManagement.repository.CustomerRepository;
import com.MedManagement.service.CustomerService;
import com.MedManagement.util.Converter;

@Service
public class CustomerServiceImlp implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private Converter converter;


	@Override
	public String addCustomer(Customer customer) {
		
		String message=null;
		
		customer.setId(customer.getId());
		customer.setCustomerName(customer.getCustomerName());
		customer.setContact(customer.getContact());
		customer.setGender(customer.getGender());
		customer.setAge(customer.getAge());
		customer.setPrice(customer.getPrice());
		customer.setMedname(customer.getMedname());
		
		customerRepository.save(customer);
		
		if (customer!=null) {
			message="customer details added succesfully....";
		}
		return message;
	}
	
	


	@Override
	public CustomerDTO getCustomerById(int id) {
		Customer customer=customerRepository.findById(id).get();
		
		return converter.convertEntityToCustomerDTO(customer);
	}


	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer> customers=customerRepository.findAll();
		List<CustomerDTO> customersDTO=new ArrayList<>();
		for (Customer c:customers) {
			customersDTO.add(converter.convertEntityToCustomerDTO(c));
		}
		
		
		return customersDTO;
	}
	



	@Override
	public CustomerDTO updateCustomer(int id, Customer customer) {
		Customer existingCustomer=customerRepository.findById(id).get();
		
		existingCustomer.setId(customer.getId());
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setContact(customer.getContact());
		existingCustomer.setGender(customer.getGender());
		existingCustomer.setAge(customer.getAge());
		existingCustomer.setPrice(customer.getPrice());
		existingCustomer.setMedname(customer.getMedname());
		
		
		customerRepository.save(existingCustomer);
		
		return converter.convertEntityToCustomerDTO(existingCustomer);
	}

	
	
	
	
}
