package com.MedManagement.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.MedManagement.entity.MedicalShop;
import com.MedManagement.model.MedicalShopDTO;
@Component
public class MedicalShopConverter {
	
	
	public MedicalShopDTO convertEntityToMedicalShopDTO(MedicalShop medicalshop) {
		MedicalShopDTO medicalShopDTO=new MedicalShopDTO();
		if(medicalshop!=null)
		{
			BeanUtils.copyProperties(medicalshop, medicalShopDTO);
		}
		return medicalShopDTO;
	}
	
		

	public MedicalShop convertDTOToMedicalShop(MedicalShopDTO medicalshopDTO) {
		MedicalShop medicalshop =new MedicalShop();
		if(medicalshopDTO!=null)
		{
			BeanUtils.copyProperties(medicalshopDTO, medicalshop);
		}
		return medicalshop;
	}


}
