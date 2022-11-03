package com.hostel.mng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Visitor {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String  name;
	@Column
	private String contact;
	@Column
	private String address;
	@Column
	private String relation;
	@Column
	private String purpose;
	
	
	public Visitor(int id, String name, String contact, String address, String relation, String purpose) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.relation = relation;
		this.purpose = purpose;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getRelation() {
		return relation;
	}


	public void setRelation(String relation) {
		this.relation = relation;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public Visitor() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
