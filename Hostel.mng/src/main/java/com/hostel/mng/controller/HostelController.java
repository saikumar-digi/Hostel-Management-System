package com.hostel.mng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Hostel;
import com.hostel.mng.model.Visitor;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.HostelRepository;
import com.hostel.mng.service.HostelService;
@Controller
@Component
public class HostelController{
	@Autowired
	HostelRepository hostelRepository;
	@Autowired
	HostelService hostelService;
	
	@RequestMapping("/hostel")
	public String Get7()
	{
		return "hostelAdd";

}
	
	@PostMapping("/hostelDetails")
	public String value2(
				
				@RequestParam("hostelName") String hostelName,
				@RequestParam("hostelType") String hostelType,
				@RequestParam("hostelContact") String hostelContact,
				@RequestParam("hostelDescription") String hostelDescription,
				@RequestParam("hostelAddress") String hostelAddress,
				@RequestParam("hostelFee") String hostelFee,  ModelMap modelMap) {
	   hostelService.viewHostel(hostelName, hostelType, hostelContact, hostelAddress, hostelDescription, hostelFee, modelMap);
		return "hostel_from";
	}
	
	@RequestMapping(value="/hlist",method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("hostellist");
		List<Hostel> hostellist=hostelService.hostellist();
		model.addObject("hostellist" ,hostellist);
		return model;
	}

	@RequestMapping(value="/hlist2",method = RequestMethod.GET)
	public ModelAndView list2() {
		ModelAndView model = new ModelAndView("userHostelList");
		List<Hostel> hostellist=hostelService.hostellist();
		model.addObject("hostellist" ,hostellist);
		return model;
	}

	
	
	
	@RequestMapping(value="/addHostel", method = RequestMethod.GET)
	public ModelAndView list1() {
		
		ModelAndView model = new ModelAndView();
		Hostel hostel = new Hostel();
	    model.addObject("hostelfrom" , hostel);
	    model.setViewName("hostel_from");
		return model;
	}
	
	
	@RequestMapping( value = "/editHostel/{hostelNo}")									
	public ModelAndView editHostel(@PathVariable int hostelNo) {
		ModelAndView model = new ModelAndView();
		Hostel hostel= hostelService.getRoomByID(hostelNo);
		model.addObject("hostelfrom", hostel);
		model.setViewName("hostel_from");
		return model;
		
		
	}

	@RequestMapping(value = "/deleteHostel/{id}",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		hostelService.delecthostel(id);
		List<Hostel> hostellist=hostelService.hostellist();
		model.addObject("hostellist",hostellist);
		model.setViewName("hostellist");
		
		return model;
	}
	
	@RequestMapping(value="/addHostel",method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("hostelfrom")Hostel hostel) {
		hostelService.addhostel(hostel);
		return new ModelAndView("redirect:/hlist");
		
	}

}
