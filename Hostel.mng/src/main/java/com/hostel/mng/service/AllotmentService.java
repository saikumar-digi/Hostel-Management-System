package com.hostel.mng.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.mng.model.Allotment;

import com.hostel.mng.repository.AllotmentRepository;
import com.hostel.mng.repository.LoginRepository;

@Service
public class AllotmentService {
	Allotment allotment;
	@Autowired
	AllotmentRepository allotmenRepository;
	
	
	public String addAllotment(
			
			@RequestParam("firstName") String firstName,
			@RequestParam("email") String email,
			@RequestParam("roomNo") String roomNo,
			ModelMap modelMap) throws ParseException{
		Allotment allot =new Allotment();
		allot.setFirstName(firstName);
		allot.setEmail(email);
		allot.setRoomNo(roomNo);
		Date date = Calendar.getInstance().getTime();  
	    allot.setAllotmentDate(date);
		
		this.allotmenRepository.save(allot);
		
		
		
		
		 modelMap.put("firstName", firstName);
		 modelMap.put("email", email);
		 modelMap.put("roomNo", roomNo);
		modelMap.put("allotmentDate", date);
		
////		 List<Allotment> list = new ArrayList<>();
////		 allotmenRepository.findAll().forEach(x->list.add(x));
//		
//		 for(Allotment e:list) {
//		        String r1=e.getRoomNo();
//		        String r2= roomNo;
//		    if(r2.equals(r1))
//		    {
//		        System.out.println(roomNo);
//		        
//		        return "allotmentAdd";
//		    }
//		    else
//		    	return "allotsave";
//		    
//		    }
//		
	        return "allotsave";
		
	}


public List<Allotment> allotlist() {
	List<Allotment>    alist = (List<Allotment>)allotmenRepository.findAll();
	return alist;
}




public boolean existroomNo(String roomNo) {
	allotment= allotmenRepository.findByroomNo(roomNo); 
	if(allotment==null)
	{
		return false;
	}
	return true;
}

public void delectallot(int id) {
	
	allotmenRepository.deleteById(id);
  }
public Allotment getdata(String email)
{
	Allotment allotment=allotmenRepository.findByemail(email);
	return allotment;
	
}
}
