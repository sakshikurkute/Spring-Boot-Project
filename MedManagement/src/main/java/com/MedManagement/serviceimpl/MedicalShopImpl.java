package com.MedManagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedManagement.entity.MedicalShop;
import com.MedManagement.model.MedicalShopDTO;
import com.MedManagement.repository.MedicalShopRepository;
import com.MedManagement.service.MedicalShopService;
import com.MedManagement.util.MedicalShopConverter;

@Service
public class MedicalShopImpl implements MedicalShopService {
	
	@Autowired
	private MedicalShopRepository medicalshopRepository;
	
	@Autowired
	private MedicalShopConverter converter; 

	@Override
	public MedicalShopDTO createMedicalShop(MedicalShop medicalshop) {
		MedicalShop ms=medicalshopRepository.save(medicalshop);
		
		return converter.convertEntityToMedicalShopDTO(ms);
	}

	@Override
	public String createMedicaString(MedicalShop medicalShop) {
		
		return null;
	}

}
