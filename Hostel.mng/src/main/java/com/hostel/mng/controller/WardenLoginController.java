package com.hostel.mng.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Login;
import com.hostel.mng.model.WardenLogin;
import com.hostel.mng.service.LoginService;
import com.hostel.mng.service.WardenLoginService;


@Controller
@Component
public class WardenLoginController {
	@Autowired
	private WardenLoginService wardenloginService;

	
	 @GetMapping("/WArdenLogin")
	 
	  public ModelAndView login() 
 { 
	  ModelAndView mav= new ModelAndView("WardenLogin"); 
	  mav.addObject("login",new WardenLogin()); 
	  return mav;
	 
}
	 
	
	  @GetMapping("/WardenLogin1")
	  public String login2() {
		return "WardenLogin";
	  
 }
	
		
	  @PostMapping("/login1") 
	  public String login(@ModelAttribute("WardenLogin") WardenLogin user) { 
		 
		  WardenLogin  oauthUser=wardenloginService.login(user.getUsername(),user.getPassword());
	  System.out.println(oauthUser); 
	  if(Objects.nonNull(oauthUser)) 
	  {
		  return "Wardenpage";
	 }
	  
	  else { 
		  return "WardenLogin"; }
	  
	  
	  }
	
	 
	 
}
