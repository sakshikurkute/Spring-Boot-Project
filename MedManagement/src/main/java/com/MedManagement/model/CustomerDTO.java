package com.MedManagement.model;

import com.MedManagement.entity.MedicalShop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDTO {

	
	private int id;
	
	private String customerName;
	
	private long contact;
	private String gender;
	
	private int age;
	
	private int price;

	private String medname;
	
	private MedicalShop medicalshop;
}
