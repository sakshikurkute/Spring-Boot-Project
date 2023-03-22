package com.MedManagement.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;


import com.MedManagement.entity.Customer;
import com.MedManagement.model.CustomerDTO;


@Component
public class Converter {
	
	
	public CustomerDTO convertEntityToCustomerDTO(Customer customer) {
		CustomerDTO customerDTO=new CustomerDTO();
		if (customer!=null)
		{
			BeanUtils.copyProperties(customer, customerDTO);
		}
		return customerDTO;
		
	}
	

	public Customer convertDTOToCustomer(CustomerDTO customerDTO) {
		Customer customer =new Customer();
		if(customerDTO!=null)
		{
			BeanUtils.copyProperties(customerDTO, customer);
		}
		return customer;
	}


	


	

}
