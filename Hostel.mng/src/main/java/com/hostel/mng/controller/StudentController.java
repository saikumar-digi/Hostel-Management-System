package com.hostel.mng.controller;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Student;
import com.hostel.mng.service.AllotmentService;
import com.hostel.mng.service.FeeService;
import com.hostel.mng.service.StudentService;


@Controller
@Component
public class StudentController {
	Student st;

	@Autowired
	StudentService studentservice;
	
	@Autowired
	AllotmentService allotmentService;
	
	@Autowired
	FeeService feeService;
		
		@PostMapping("/details")
	public String value1(//@RequestParam("id") int id,
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName")  String lastName,
            @RequestParam("mobileNo") String mobileNo,
            @RequestParam("age" ) int age,
            @RequestParam("gender") String gender,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            //@RequestParam("passConfirm") String passConfirm,


            ModelMap modelMap ) throws ParseException{
			
			studentservice.viewDetails(firstName, lastName, mobileNo, age, gender, email, password, modelMap);
			return "Registersucc";
			
		}
		
	
		@PostMapping("/studentvalidation")
		public String login(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap modelMap){
			
			try {
				st=studentservice.stlogin(email, password);
			}catch(Exception e) {
				System.out.println("Error");
			}
			if(st!=null) {
				return "Loginsucc";
			}
			 modelMap.put("error","Eamil or Password that you've entered is incorrect");

			return "Login";
		
		}
		
		
		
		@GetMapping("/profile")
		public String viewProfile(ModelMap model) {
			model.addAttribute("id", st.getId());
			model.addAttribute("first_name", st.getFirstName());
			model.addAttribute("last_name", st.getLastName());
			model.addAttribute("mobile_no", st.getMobileNo());
			model.addAttribute("email", st.getEmail());
			model.addAttribute("age", st.getAge());
			model.addAttribute("gender", st.getGender());
			return "studentprofile";
		}
		
@GetMapping("/studentallotment")
public String viewallotment(ModelMap map)
{
	map.put("allotment", allotmentService.getdata(st.getEmail()));
	return "Allotment";
}
@GetMapping("/paymenthistory")
public String viepaymenthistory(ModelMap map)
{
	map.put("fee", feeService.getdata(st.getEmail()));
	return "paymenthistory";
}





@GetMapping("/")
public String Entry() {
	
	return "home";
}	
@GetMapping("contactus")
public String contactus() {
	
	return "contactus";
}
@GetMapping("aboutus")
public String aboutus() {
	
	return "aboutus";
}
	@GetMapping("/User1")
	public String Get()
	{
		return "Login";
	
}
	
	@GetMapping("/Create")
	public String Get1()
	{
		return "Registration";
	
}
	@GetMapping("/LoginSucc")
	public String Get2()
	{
		return "Loginsucc";
	
}
	@GetMapping("/Login")
	public String Get3()
	{
		return "Registersuccjsp";	
}
	@GetMapping("/Logout")
	public String logout()
	{
		return "Login";	
}

//	@GetMapping("/Application")
//	public String showRooms(Model model) {
//		model.addAttribute("room",Arrays.asList(101,102,103));
//		return "sapplication";
//	}


}


