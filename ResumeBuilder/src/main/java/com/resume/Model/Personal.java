package com.resume.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PERSONAL")
public class Personal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	 private String Fname;
	 private String Lname;
	 private String Gender;
	 private String DOB;
	 private String Nationality;
	 private String Address;
	 private String State;
	 private int Pincode;
	 private String Language;
	 private String Email;
	 private String Hobbies;
	 private long PhoneNo;
	 
	 
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return pid;
	}


	public void setId(int pid) {
		this.pid = pid;
	}


	public String getFname() {
		return Fname;
	}


	public void setFname(String fname) {
		Fname = fname;
	}


	public String getLname() {
		return Lname;
	}


	public void setLname(String lname) {
		Lname = lname;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}


	public String getNationality() {
		return Nationality;
	}


	public void setNationality(String nationality) {
		Nationality = nationality;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public int getPincode() {
		return Pincode;
	}


	public void setPincode(int pincode) {
		Pincode = pincode;
	}


	public String getLanguage() {
		return Language;
	}


	public void setLanguage(String language) {
		Language = language;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getHobbies() {
		return Hobbies;
	}


	public void setHobbies(String hobbies) {
		Hobbies = hobbies;
	}


	public long getPhoneNo() {
		return PhoneNo;
	}


	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}
	 

}
