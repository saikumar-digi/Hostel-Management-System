package com.hostel.mng.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hostel.mng.model.Visitor;
import com.hostel.mng.model.Warden;
import com.hostel.mng.service.StudentService;
import com.hostel.mng.service.VisitorService;


@Controller
@Component
public class VisitorController {
	
	@Autowired
	VisitorService visitorservice;
	
	
	
	@GetMapping("/addvisit")
	public String Get1()
	{
		return "visitorjsp";
	
}
	
	
	
	@PostMapping("/details1")
	public String value1(//@RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("contactNo")  String contactNo,
            @RequestParam("address") String address,
            @RequestParam("relation") String relation,
            @RequestParam("purpose") String purpose,
            


            ModelMap modelMap ) throws ParseException{
			
			visitorservice.visitorDetails(name, contactNo, address, relation, purpose, modelMap);
			return "visitorsucc";
		
		}
	
	
	@RequestMapping(value="/vlist",method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("visitorlist");
		List<Visitor> visitorlist=visitorservice.visitorlist();
		model.addObject("visitorlist" ,visitorlist);
		return model;
	}
	

	@RequestMapping(value="/wvlist1",method = RequestMethod.GET)
	public ModelAndView list1() {
		
		ModelAndView model = new ModelAndView("WardanVisitor");
		List<Visitor> visitorlist=visitorservice.visitorlist();
		model.addObject("visitorlist" ,visitorlist);
		return model;
	}
	
	
	
	@GetMapping("/wvlist")
	public String data(ModelMap model) {
		return visitorservice.data(model);
	}
	
	
	
	@RequestMapping(value = "/deletevisitor/{id}",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		visitorservice.delectvisitor(id);
		List<Visitor> visitorlist=visitorservice.visitorlist();
		model.addObject("visitorlist",visitorlist);
		model.setViewName("visitorlist");
		//return new ModelAndView("wardenlist");
		return model;
	}
		

}
