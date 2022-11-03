package com.hostel.mng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;


import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.WardenRepository;

@Service
public class WardenService {
	@Autowired
	WardenRepository wardenRepository;
	
	public String  viewDetails(//@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("email")  String email,
            @RequestParam("contact") String contact,
            @RequestParam("gender" ) String  gender,
            @RequestParam("age") int age,
            @RequestParam("city" ) String city,
            @RequestParam("address") String address){
        Warden war=new Warden();
        
    //   user.setId(id);
        	war.setName(name);
        	war.setEmail(email);
        	war.setContact(contact);
        	war.setGender(gender);
        	war.setAge(age);
        	war.setCity(city);
        	war.setAddress(address);
        	
      
        
        this.wardenRepository.save(war);
        
        return "Registersucc";
       
    }
	
	public void warden(Warden warden) {
		wardenRepository.save(warden);
	}
	
	
	
	
	public List<Warden> wardenlist() {
		List<Warden>    wlist = (List<Warden>) wardenRepository.findAll();
		return  wlist;
	}
	
	
	
	
	public Warden getWardenByID(int id) {
		return wardenRepository.findById(id).get();
	}
	
	public void addwarden(Warden warden) {
		wardenRepository.save(warden);
	}
	


	public void delectWarden(int id) {
		
		wardenRepository.deleteById(id);
		
	}
	
	
}
