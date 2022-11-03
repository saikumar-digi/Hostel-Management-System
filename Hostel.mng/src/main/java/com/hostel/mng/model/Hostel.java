package com.hostel.mng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hostel")
public class Hostel {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int hostelNo;
	@Column
	private String hostelName;
	@Column
	private String hostelType;
	@Column
	private String hostelContact;
	@Column
	private String hostelAddress;
	@Column
	private String hostelDescription;
	@Column
	private String hostelFee;
	public int getHostelNo() {
		return hostelNo;
	}
	public void setHostelNo(int hostelNo) {
		this.hostelNo = hostelNo;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getHostelType() {
		return hostelType;
	}
	public void setHostelType(String hostelType) {
		this.hostelType = hostelType;
	}
	public String getHostelContact() {
		return hostelContact;
	}
	public void setHostelContact(String hostelContact) {
		this.hostelContact = hostelContact;
	}
	public String getHostelAddress() {
		return hostelAddress;
	}
	public void setHostelAddress(String hostelAddress) {
		this.hostelAddress = hostelAddress;
	}
	public String getHostelDescription() {
		return hostelDescription;
	}
	public void setHostelDescription(String hostelDescription) {
		this.hostelDescription = hostelDescription;
	}
	public String getHostelFee() {
		return hostelFee;
	}
	public void setHostelFee(String hostelFee) {
		this.hostelFee = hostelFee;
	}
	public Hostel(int hostelNo, String hostelName, String hostelType, String hostelContact, String hostelAddress,
			String hostelDescription, String hostelFee) {
		super();
		this.hostelNo = hostelNo;
		this.hostelName = hostelName;
		this.hostelType = hostelType;
		this.hostelContact = hostelContact;
		this.hostelAddress = hostelAddress;
		this.hostelDescription = hostelDescription;
		this.hostelFee = hostelFee;
	}
	public Hostel() {
		
	}
	
	
}
