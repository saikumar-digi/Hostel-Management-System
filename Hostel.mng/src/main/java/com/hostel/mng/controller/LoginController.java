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
import com.hostel.mng.service.LoginService;

@Controller
@Component
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	

  @GetMapping("/AdminLogin")
 
	  public ModelAndView login() 
  { 
	  ModelAndView mav= new ModelAndView("AdminLogin"); 
	  mav.addObject("login",new Login()); 
	  return mav;
	 
}
	  
	  @GetMapping("/Login1")
	  public String login1() {
		return "Adminpage";
	  
  }
	  @GetMapping("/AdminLogin1")
	  public String login2() {
		return "AdminLogin";
	  
  }

	
	
	  @PostMapping("/login") 
	  public String login(@ModelAttribute("Login") Login
	  user) { Login
	  oauthUser=loginService.login(user.getUsername(),user.getPassword());
	  System.out.println(oauthUser); 
	  if(Objects.nonNull(oauthUser)) 
	  {
		  return "Adminpage";
	 }
	  
	  else { 
		  return "home"; }
	  
	  
	  }
	  
	  @GetMapping("/Login5")
	  public String login5() {
		return "Loginsucc";
	  
  }
	 
}
