package com.hostel.mng.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fee")
public class Fee {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feeId;
	@Column
	private String firstName;
	@Column
	private String email;
	@Column
	private String roomNo;
	@Column
	private Date feedate;
	@Column
	private String totalfee;
	@Column
	private String paidfee;
	@Column
	private String remainingfee;
	public Fee(int feeId, String firstName, String email, String roomNo, Date feedate, String totalfee, String paidfee,
			String remainingfee) {
		super();
		this.feeId = feeId;
		this.firstName = firstName;
		this.email = email;
		this.roomNo = roomNo;
		this.feedate = feedate;
		this.totalfee = totalfee;
		this.paidfee = paidfee;
		this.remainingfee = remainingfee;
	}
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFeeId() {
		return feeId;
	}
	public void setFeeId(int feeId) {
		this.feeId = feeId;
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
	public Date getFeedate() {
		return feedate;
	}
	public void setFeedate(Date feedate) {
		this.feedate = feedate;
	}
	public String getTotalfee() {
		return totalfee;
	}
	public void setTotalfee(String totalfee) {
		this.totalfee = totalfee;
	}
	public String getPaidfee() {
		return paidfee;
	}
	public void setPaidfee(String paidfee) {
		this.paidfee = paidfee;
	}
	public String getRemainingfee() {
		return remainingfee;
	}
	public void setRemainingfee(String remainingfee) {
		this.remainingfee = remainingfee;
	}

}
