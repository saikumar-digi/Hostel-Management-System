package com.hostel.mng.controller;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Login;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.WardenRepository;
import com.hostel.mng.service.WardenService;

@Controller
@Component
public class WardenController {
	
	@Autowired
	WardenService wardenservice;
	@Autowired
	WardenRepository wardenRepository;
	
	@GetMapping("/wl")
	public String addWarden()
	{
		return "warden_form1";
	
}
		
	@PostMapping("/wardendetails")
	public String value1(//@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("email")  String email,
            @RequestParam("contact") String contact,
            @RequestParam("gender" ) String gender,
            @RequestParam("age") int age,
            @RequestParam("city") String city,
            @RequestParam("address") String address
            //@RequestParam("passConfirm") String passConfirm,
            ) throws ParseException{
			
			wardenservice.viewDetails(name, email, contact, gender, age, city, address);
			
			return "warden_from";
			
		}
//---------------------------------------------------------------------------------------------------------//	
	@RequestMapping("/Admin")
	public String go() {
		return "Adminpage";
	}
	
	@RequestMapping("/HostelList")
	public String HostelList() {
		return "HostelList";
	}
	
	@RequestMapping("/Warden")
	public String RoomList() {
		return "Wardenpage";
	}
	

	
	
//	show
	@RequestMapping("/wlist1")
	public ModelAndView list() {
	
		ModelAndView model = new ModelAndView("wardenlist");
		List<Warden> wardenlist=wardenservice.wardenlist();
		System.out.println(wardenlist);
		model.addObject("wardenlist" ,wardenlist);
		return model;
	}
	
	
	
	
	
//Will show fundriser form
@RequestMapping(value="/addWarden", method = RequestMethod.GET)
	public ModelAndView list1() {
		
		ModelAndView model = new ModelAndView();
		Warden warden = new Warden();
	    model.addObject("wardenfrom" , warden);
	    model.setViewName("warden_from");
		return model;
	}
	
	
	@RequestMapping( value = "/editWarden/{id}")
	public ModelAndView editWarden(@PathVariable int id) {
		ModelAndView model = new ModelAndView();
		Warden warden= wardenservice.getWardenByID(id);
		model.addObject("wardenfrom", warden);
		model.setViewName("warden_from");
		return model;
		
		
	}
	
	@RequestMapping(value = "/deleteWarden/{id}",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		wardenservice.delectWarden(id);
		List<Warden> wardenlist=wardenservice.wardenlist();
		model.addObject("wardenlist",wardenlist);
		model.setViewName("wardenlist");
		//return new ModelAndView("wardenlist");
      return model;
}
	
	
	
//	
//	
//	
//	@RequestMapping(value="/wlist",method = RequestMethod.GET)
//	public ModelAndView list() {
//		ModelAndView model = new ModelAndView();
//		Warden warden= new Warden();
//		model.addObject("wardenfrom", warden);
//		model.setViewName("warden_from");
//	return model;
//	}
	
	
	@RequestMapping(value="/addWarden",method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("wardenfrom")Warden warden) {
		wardenservice.addwarden(warden);
		return new ModelAndView("redirect:/wlist1");
		
	}
	
	}


