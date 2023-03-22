package com.MedManagement.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length= 50, name="customer")
	private String customerName;
	@Column(length=20)
	private long contact;
	@Column(length=20)
	private String gender;
	@Column(length=50)
	private int age;
	@Column(length=50)
	private int price;
	@Column(length=50)
	private String medname;
	
	@ManyToOne
	private MedicalShop medicalshop;


}
