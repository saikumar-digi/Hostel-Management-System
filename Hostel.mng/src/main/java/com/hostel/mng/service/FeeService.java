package com.hostel.mng.service;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

import com.hostel.mng.model.Allotment;
import com.hostel.mng.model.Fee;
import com.hostel.mng.repository.AllotmentRepository;
import com.hostel.mng.repository.FeeRepository;
@Service
public class FeeService {
		@Autowired
		FeeRepository feeRepository;
		public String addFee(
				@RequestParam("firstName") String firstName,
				@RequestParam("email") String email,
				@RequestParam("roomNo") String roomNo,
				@RequestParam("totalfee") String totalfee,
				@RequestParam("paidfee") String paidfee,
				@RequestParam("remainingfee") String remainingfee,
				ModelMap modelMap) throws ParseException{
			Fee fee =new Fee();
			fee.setFirstName(firstName);
			fee.setEmail(email);
			fee.setRoomNo(roomNo);
			Date date = Calendar.getInstance().getTime();  
		    fee.setFeedate(date);
		    fee.setTotalfee(totalfee);
		    fee.setPaidfee(paidfee);
		    fee.setRemainingfee(remainingfee);
			
			this.feeRepository.save(fee);
			
			 modelMap.put("firstName", firstName);
			 modelMap.put("email", email);
			 modelMap.put("roomNo", roomNo);
			 modelMap.put("feedate", date);
			 modelMap.put("totalfee", totalfee);
			 modelMap.put("paidfee", paidfee);
			 modelMap.put("remainingfee", remainingfee);
			
			
		        return "feesave";
			
		}
		public List<Fee> feelist() {
			List<Fee>    flist = (List<Fee>)feeRepository.findAll();
			return flist;
		}
		
		
		public Fee getdata(String email)
		{
			Fee fee=feeRepository.findByemail(email);
			return fee;
			
		}

}
