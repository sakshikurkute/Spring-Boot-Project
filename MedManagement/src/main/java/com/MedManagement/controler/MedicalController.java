package com.MedManagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedManagement.entity.MedicalShop;
import com.MedManagement.model.MedicalShopDTO;
import com.MedManagement.service.MedicalShopService;

import com.MedManagement.util.MedicalShopConverter;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/medicalshop")
public class MedicalController {
	
	
	@Autowired
	private MedicalShopService medicalshopService;
	
	@Autowired
	private MedicalShopConverter converter;
	
	@PostMapping("/createMedicalShop")
	public MedicalShopDTO createCustomer(@Valid @RequestBody MedicalShopDTO medicalshopDTO)
	{
		MedicalShop medicalShop=converter.convertDTOToMedicalShop(medicalshopDTO);
		return medicalshopService.createMedicalShop(medicalShop);
	}
}

