package com.hostel.mng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="application")
public class Sapplication {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StudentUserId;
	@Column
	private String studentname;
	@Column
	private String studentMobileNo;
	@Column
	private String studentEmail;
	@Column
	private String studentGender;
	@Column
	private String studentQualification;
	@Column
	private int studentAge;
	@Column
	private String studentCity;
	@Column
	private String studentAddress;
	public Sapplication(int studentUserId, String studentname, String studentMobileNo, String studentEmail,
			String studentGender, String studentQualification, int studentAge, String studentCity,
			String studentAddress) {
		super();
		StudentUserId = studentUserId;
		this.studentname = studentname;
		this.studentMobileNo = studentMobileNo;
		this.studentEmail = studentEmail;
		this.studentGender = studentGender;
		this.studentQualification = studentQualification;
		this.studentAge = studentAge;
		this.studentCity = studentCity;
		this.studentAddress = studentAddress;
	}
	public Sapplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentUserId() {
		return StudentUserId;
	}
	public void setStudentUserId(int studentUserId) {
		StudentUserId = studentUserId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentMobileNo() {
		return studentMobileNo;
	}
	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentQualification() {
		return studentQualification;
	}
	public void setStudentQualification(String studentQualification) {
		this.studentQualification = studentQualification;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
}
