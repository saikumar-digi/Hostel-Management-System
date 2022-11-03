package com.hostel.mng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.mng.model.Sapplication;
import com.hostel.mng.model.Warden;
import com.hostel.mng.model.Hostel;
import com.hostel.mng.repository.SapplicationRepository;
import com.hostel.mng.repository.HostelRepository;
@Service
public class SapplicationService {
	
	@Autowired
	SapplicationRepository sapplicationRepository;
	
	public String viewSapplication(
			
			@RequestParam("studentname") String studentname,
			@RequestParam("studentMobileNo") String studentMobileNo,
			@RequestParam("studentEmail") String studentEmail,
			@RequestParam("studentGender") String studentGender,
			@RequestParam("studentQualification") String studentQualification,
			@RequestParam("studentAge") int studentAge, 
			@RequestParam("studentCity") String studentCity,
			@RequestParam("studentAddress") String studentAddress,ModelMap modelMap){
		Sapplication api =new Sapplication();
		
		api.setStudentname(studentname);
		api.setStudentMobileNo(studentMobileNo);
		api.setStudentEmail(studentEmail);
		api.setStudentGender(studentGender);
		api.setStudentQualification(studentQualification);
		api.setStudentAge(studentAge);
		api.setStudentCity(studentCity);
		api.setStudentAddress(studentAddress);
		
		this.sapplicationRepository.save(api);
		
		 modelMap.put("studentname", studentname);
		 modelMap.put("studentMobileNo", studentMobileNo);
		 modelMap.put("studentEmail", studentEmail);
		 modelMap.put("studentGender", studentGender);
		 modelMap.put("studentQualification", studentQualification);
		 modelMap.put("studentAge", studentAge);
		 modelMap.put("studentCity", studentCity);
		 modelMap.put("studentAddress", studentAddress);
	        return "sapplicationsave";
		
	}
	
	public List<Sapplication> sapplicationList() {
		List<Sapplication> alist= (List<Sapplication>) sapplicationRepository.findAll();
		return  alist;
	}

}
