package com.hostel.mng.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="allotment")
public class Allotment {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int applicationId;
@Column
	private String firstName;
@Column
	private String email;
@Column
	private String roomNo;
@Column
	private Date allotmentDate;
public int getApplicationId() {
	return applicationId;
}
public void setApplicationId(int applicationId) {
	this.applicationId = applicationId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRoomNo() {
	return roomNo;
}
public void setRoomNo(String roomNo) {
	this.roomNo = roomNo;
}
public Date getAllotmentDate() {
	return allotmentDate;
}
public void setAllotmentDate(Date allotmentDate) {
	this.allotmentDate = allotmentDate;
}
public Allotment(int applicationId, String firstName, String email, String roomNo, Date allotmentDate) {
	super();
	this.applicationId = applicationId;
	this.firstName = firstName;
	this.email = email;
	this.roomNo = roomNo;
	this.allotmentDate = allotmentDate;
}
public Allotment() {
	super();
	// TODO Auto-generated constructor stub
}

	
	

}
