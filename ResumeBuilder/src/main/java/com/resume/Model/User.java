package com.resume.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER")

public class User {
	
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int id;
 private String Fname;
 private String Lname;
 private String Email;
 private String Password;
 private String Gender;
 private String Role;
 
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

public String getRole() {
	return Role;
}

public void setRole(String role) {
	Role = role;
}
 
 
}
