package com.MedManagement.model;

import java.util.List;

import com.MedManagement.entity.Customer;


import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter



public class MedicalShopDTO {
	private int mId;
	@NotNull
	private String name;
	
	private int contact;
	
	private String medicalshop;
	private List<Customer> customer;

}
