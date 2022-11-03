package com.hostel.mng.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;


import com.hostel.mng.model.Room;
import com.hostel.mng.model.Visitor;
import com.hostel.mng.model.Warden;
import com.hostel.mng.repository.RoomRepository;

@Service
public class RoomService {
	@Autowired
	RoomRepository roomRepository;
	
	public String viewRoom(@RequestParam("roomNo") String RoomNo,

			@RequestParam("roomType") String RoomType,
			@RequestParam("status") String Status,
		
			ModelMap modelMap){
		Room room =new Room();
		int roomNo=Integer.parseInt(RoomNo);
		room.setRoomNo(roomNo);
		room.setRoomType(RoomType);
		room.setStatus(Status);
		 
		this.roomRepository.save(room);
		 modelMap.put("roomNo", RoomNo);
		 modelMap.put("roomType", RoomType);
		 modelMap.put("status", Status);
		 return "roomsave";
	}
	public List<Room>     roomlist() {
		List<Room>   rlist = (List<Room>) roomRepository.findAll();
		return  rlist;
	}
	
	
	public Room getRoomByID(int roomNo) {
		return roomRepository.findById(roomNo).get();
	}
	
	public void addroom(Room room) {
		roomRepository.save(room);
	}
	
	
  public void delectroom(int id) {
		
		roomRepository.deleteById(id);
		
	}


}
