package com.MedManagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MedManagement.entity.Customer;
import com.MedManagement.model.CustomerDTO;
import com.MedManagement.service.CustomerService;
import com.MedManagement.util.Converter;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private Converter converter;
	
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody CustomerDTO customerDTO) {
		final Customer customer =converter.convertDTOToCustomer(customerDTO);
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/getCustomerById/{id}")
	public CustomerDTO getCustomerById(@PathVariable("id")int id) {
		return customerService.getCustomerById(id);
	}
	@GetMapping("/getAllCustomer")
	public List<CustomerDTO> getAllcustomer()
	{
		return customerService.getAllCustomer();
	}
		@PutMapping("/updateCustomer/{id}")
		public CustomerDTO updateCustomer(@PathVariable("id") int id,@RequestBody
				CustomerDTO customerDTO) {
			Customer customer1=converter.convertDTOToCustomer(customerDTO);
			return customerService.updateCustomer(id,customer1);
					
		}


}
