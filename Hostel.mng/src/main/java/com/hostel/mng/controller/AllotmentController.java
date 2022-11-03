package com.hostel.mng.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Allotment;
import com.hostel.mng.model.Hostel;
import com.hostel.mng.model.Room;
import com.hostel.mng.repository.AllotmentRepository;

import com.hostel.mng.service.AllotmentService;


@Controller
@Component
public class AllotmentController {
	@Autowired
	AllotmentRepository allotmentRepository;
	@Autowired
	AllotmentService allotmentService;
	
	@RequestMapping("/allot")
	public String Get7()
	{
		return "allotmentAdd";

}
	
	@PostMapping("/allotDetails")
	public String value2(
				
				@RequestParam("firstName") String firstName,
				@RequestParam("email") String email,
				@RequestParam("roomNo") String roomNo,
			  ModelMap modelMap) throws ParseException {
		if(allotmentService.existroomNo(roomNo))
		{
		   modelMap.put("roomerror"," This Room is Already Booked ");
		}
		else {
			allotmentService.addAllotment(firstName, email, roomNo,  modelMap);
		}
		
		return "allotmentAdd";
	}
	
	
	@RequestMapping(value="/alist",method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("allotlist");
		List<Allotment> allotlist=allotmentService.allotlist();
		model.addObject("allotlist" ,allotlist);
		return model;
		
		
	}
	
	@RequestMapping(value = "/deleteallot/{id}",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		allotmentService.delectallot(id);
		List<Allotment> allotlist=allotmentService.allotlist();
		model.addObject("allotlist",allotlist);
		model.setViewName("allotlist");
		//return new ModelAndView("wardenlist");
		return model;
	}


}
