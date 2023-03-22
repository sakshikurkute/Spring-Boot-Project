package com.MedManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MedManagement.entity.MedicalShop;

public interface MedicalShopRepository extends JpaRepository<MedicalShop, Integer> {

	
	List<MedicalShop> findByName(String name);
	//customize method for find medical shop using id
    List<MedicalShop> findById(int mId);
    
    List<MedicalShop> findBycontact(int contact);
}
