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

import com.hostel.mng.model.Fee;
import com.hostel.mng.repository.FeeRepository;
import com.hostel.mng.service.FeeService;

@Controller
@Component
public class FeeController {
	
	@Autowired
		FeeRepository feeRepository;
	@Autowired
	FeeService feeService;
	
	
	
	@RequestMapping("/fee")
	public String Get7()
	{
		return "feeAdd";

}
	@PostMapping("/feeDetails")
	public String value2(
				
			@RequestParam("firstName") String firstName,
			@RequestParam("email") String email,
			@RequestParam("roomNo") String roomNo,
			@RequestParam("totalfee") String totalfee,
			@RequestParam("paidfee") String paidfee,
			@RequestParam("remainingfee") String remainingfee,
			ModelMap modelMap) throws ParseException{
		
		
		feeService.addFee(firstName, email, roomNo, totalfee, paidfee, remainingfee, modelMap);
		return "feeAdd";
	}
	
	
	
	@RequestMapping(value="/flist",method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("feelist");
		List<Fee> feelist=feeService.feelist();
		model.addObject("feelist" ,feelist);
		return model;
	}
	
}
