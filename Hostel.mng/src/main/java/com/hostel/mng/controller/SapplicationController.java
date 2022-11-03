package com.hostel.mng.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Hostel;
import com.hostel.mng.repository.SapplicationRepository;
import com.hostel.mng.repository.WardenRepository;
import com.hostel.mng.service.SapplicationService;
import com.hostel.mng.service.WardenService;


@Controller
@Component
public class SapplicationController {

	
	@RequestMapping("/Sapplication")
	public String Sapplication()
	{
		return "Sapplication_Add";

}
	
	
	@RequestMapping("/warden4")
	public String studentvalidation() {
		return "Loginsucc";
	}
	
	
	
	
	@Autowired
	SapplicationService sapplicationService;
	@Autowired
	SapplicationRepository sapplicationRepository;
	
	
	@PostMapping("/sappicationDetails")
	public String value1(
            @RequestParam("studentname") String studentname,
            @RequestParam("studentMobileNo")  String studentMobileNo,
            @RequestParam("studentEmail") String studentEmail,
            @RequestParam("studentGender" ) String studentGender,
            @RequestParam("studentQualification") String studentQualification,
            @RequestParam("studentAge") int studentAge,
            @RequestParam("studentCity") String studentCity,
            @RequestParam("studentAddress") String studentAddress,ModelMap modelMap
            //@RequestParam("passConfirm") String passConfirm,
            ) throws ParseException{
			
		sapplicationService.viewSapplication(studentname, studentMobileNo, studentEmail, 
				studentGender, studentQualification, studentAge, studentCity, studentAddress, modelMap);
			
			return "sapplication";
			
		}
	@RequestMapping(value="/applicationlist",method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("sapplicationList");
		List<com.hostel.mng.model.Sapplication> sapplicationList=sapplicationService.sapplicationList();
		model.addObject("sapplicationList" ,sapplicationList);
		return model;
	}
}
