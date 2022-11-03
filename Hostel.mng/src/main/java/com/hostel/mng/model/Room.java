package com.hostel.mng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
	@Id
	@Column
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int roomNo;
	@Column
	private String roomType;
	@Column
	private String status;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Room(int roomNo, String roomType, String status) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.status = status;
	}
	public Room() {}


}