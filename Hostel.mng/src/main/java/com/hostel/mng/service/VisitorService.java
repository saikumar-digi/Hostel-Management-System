package com.hostel.mng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;


import com.hostel.mng.model.Visitor;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.VisitorRepository;
@Service
public class VisitorService {
	@Autowired
	public VisitorRepository visitorRepository;
	
	public String  visitorDetails(//@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("contact")  String contact,
            @RequestParam("address") String address,
            @RequestParam("relation" ) String  relation,
            @RequestParam("purpose") String purpose,
      
            //@RequestParam("passConfirm") String passConfirm,


             ModelMap modelMap){
        Visitor user=new Visitor();
        
        
        
        user.setName(name);
        user.setContact(contact);
        user.setAddress(address);
        user.setRelation(relation);
        user.setPurpose(purpose);
        
       
       
        
          //user.setPassConfirm(passConfirm);
        
          this.visitorRepository.save(user);
          
          
          modelMap.put("name",name);
          modelMap.put("contact", contact);
          modelMap.put("address", address);
          modelMap.put("relation", relation);
          modelMap.put("purpose", purpose);
        
          return "Visitorsucc";
	}
	
	public List<Visitor>      visitorlist() {
		List<Visitor>   vlist = (List<Visitor>) visitorRepository.findAll();
		return  vlist;
	}
	

	
	public String data(ModelMap model) {
		List<Visitor>user=new  ArrayList<Visitor>();
		visitorRepository.findAll().forEach(i->user.add(i));
		model.addAttribute("result", user);
		return "WardanVisitor";
	}
	
	
	
	
	
	
	
	
	
  public void delectvisitor(int id) {
		
		visitorRepository.deleteById(id);
		
	}

	
}
