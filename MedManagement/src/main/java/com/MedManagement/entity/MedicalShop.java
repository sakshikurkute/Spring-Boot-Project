package com.MedManagement.entity;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MedicalShop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mId;
	@Column(length = 30, nullable=false)
	
	private String name;
	@Column(length = 30, nullable=false)
	
	private int contact;
	@Column(length = 30)
	
	private String medicalshop;
	
	@OneToMany
	private List<Customer> customer;

}
