package org.test.login;

public class EmpDetails {
private int empId;
private String name;
private long phone;
private String address;
private String dob;
private String doj;
private String eMail;
private char gender;
private float sal;

public void setEmpId(int empId) {
	this.empId = empId;
}
public void setName(String name) {
	this.name = name;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public void setAddress(String address) {
	this.address = address;
}
public int getEmpId() {
	return empId;
}
public String getName() {
	return name;
}
public long getPhone() {
	return phone;
}
public String getAddress() {
	return address;
}
public String getDob() {
	return dob;
}
public String getDoj() {
	return doj;
}
public String geteMail() {
	return eMail;
}
public char getGender() {
	return gender;
}
public float getSal() {
	return sal;
}
public void setDob(String dob) {
	this.dob = dob;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public void setGender(char gender) {
	this.gender = gender;
}
public void setSal(float sal) {
	this.sal = sal;
}
}
