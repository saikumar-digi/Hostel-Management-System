package com.hostel.mng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.mng.model.Hostel;
import com.hostel.mng.model.Room;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.HostelRepository;

@Service
public class HostelService {
	@Autowired
	HostelRepository hostelRepository;
	public String viewHostel(
			
			@RequestParam("hostelName") String hostelName,
			@RequestParam("hostelType") String hostelType,
			@RequestParam("hostelContact") String hostelContact,
			@RequestParam("hostelAddress") String hostelAddress,
			@RequestParam("hostelDescription") String hostelDescription, 
			@RequestParam("hostelFee") String hostelFee,ModelMap modelMap){
		Hostel hostel =new Hostel();
		
		hostel.setHostelName(hostelName);
		hostel.setHostelType(hostelType);
		hostel.setHostelContact(hostelContact);
		hostel.setHostelAddress(hostelAddress);
		hostel.setHostelDescription(hostelDescription);
		hostel.setHostelFee(hostelFee);
		this.hostelRepository.save(hostel);
		
		 modelMap.put("hostelName", hostelName);
		 modelMap.put("hostelType", hostelType);
		 modelMap.put("hostelContact", hostelContact);
		 modelMap.put("hostelAddress", hostelAddress);
		 modelMap.put("hostelDescription", hostelDescription);
		 modelMap.put("hostelFee", hostelFee);
	        return "hostelsave";
		
	}
	public List<Hostel> hostellist() {
		List<Hostel>    vlist = (List<Hostel>) hostelRepository.findAll();
		return  vlist;
	}

	

	public Hostel getRoomByID(int hostelNo){
		return hostelRepository.findById(hostelNo).get();
	}
	
	
	public void addhostel(Hostel hostel) {
		hostelRepository.save(hostel);
	}
	

   public void delecthostel(int id) {
	
	hostelRepository.deleteById(id);
   }
}


