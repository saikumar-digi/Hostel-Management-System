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

import com.hostel.mng.model.Room;
import com.hostel.mng.model.Visitor;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.HostelRepository;
import com.hostel.mng.repository.RoomRepository;
import com.hostel.mng.service.HostelService;
import com.hostel.mng.service.RoomService;

@Controller

public class RoomController {
	@Autowired
	RoomRepository roomRepository;
	@Autowired
	RoomService roomService;
	
	@RequestMapping("/room")
	public String Get7()
	{
		return "roomadd";

}
	
	@PostMapping("/roomDetails")
	public String value3(
			@RequestParam("roomNo") String RoomNo,
				@RequestParam("roomType") String RoomType,
				@RequestParam("status") String Status,
				
				 ModelMap modelMap) {
	   roomService.viewRoom(RoomNo, RoomType, Status, modelMap);
		return "roomsave";
	}

	
	@RequestMapping(value="/rlist",method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("roomlist");
		List<Room> roomlist=roomService.roomlist();
		model.addObject("roomlist" ,roomlist);
		return model;
	}

	@RequestMapping(value="/rlist2",method = RequestMethod.GET)
	public ModelAndView list2() {
		
		ModelAndView model = new ModelAndView("userRoomList");
		List<Room> roomlist=roomService.roomlist();
		model.addObject("roomlist" ,roomlist);
		return model;
	}
	
	@RequestMapping(value="/rlist3",method = RequestMethod.GET)
	public ModelAndView list3() {
		
		ModelAndView model = new ModelAndView("userRoomList");
		List<Room> roomlist=roomService.roomlist();
		model.addObject("roomlist" ,roomlist);
		return model;
	}

	@RequestMapping(value="/addRoom", method = RequestMethod.GET)
	public ModelAndView list1() {
		
		ModelAndView model = new ModelAndView();
		Room room = new Room();
	    model.addObject("roomform" , room);
	    model.setViewName("room_form");
		return model;
	}
	
	
	@RequestMapping( value = "/editRoom/{roomNo}")
	public ModelAndView editRoom(@PathVariable int roomNo) {
		ModelAndView model = new ModelAndView();
		Room room= roomService.getRoomByID(roomNo);
		model.addObject("roomform", room);
		model.setViewName("room_form");
		return model;
		
		
	}
	
	@RequestMapping(value = "/deleteroom/{id}",method = RequestMethod.GET)
	public ModelAndView delet(@PathVariable("id") int id) {
		ModelAndView model=new ModelAndView();
		roomService.delectroom(id);
		List<Room> roomlist=roomService.roomlist();
		model.addObject("roomlist",roomlist);
		model.setViewName("roomlist");
				return model;
	}
	
	@RequestMapping(value="/addRoom",method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("roomform")Room room) {
		roomService.addroom(room);
		return new ModelAndView("redirect:/rlist");
		
	}

}
