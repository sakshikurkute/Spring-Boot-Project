package com.MedManagement.service;

import com.MedManagement.entity.MedicalShop;
import com.MedManagement.model.MedicalShopDTO;

public interface MedicalShopService {
	
	MedicalShopDTO createMedicalShop(MedicalShop medicalshop);
	
	String createMedicaString(MedicalShop medicalShop);
	
}
