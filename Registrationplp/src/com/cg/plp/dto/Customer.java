package com.cg.plp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="customertab")
public class Customer {
	
	
	@Id
	@Column(name="c_userid")
	Integer userid;
	@Column(name="c_fname")
	String firstname;
	@Column(name="c_lname")
	String lastname;
	@Column(name="c_address")
	String address;
	@Column(name="c_mobile")
	String mobileNo;
	@Column(name="c_uname")
	String username;
	@Column(name="c_pwd")
	String password;
	@Column(name="c_age")
	String age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUserid() {
		return userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getAddress() {
		return address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getAge() {
		return age;
	}
	public void setUserid() {
		this.userid = (int) (Math.random()*10000);
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Customer(Integer userid, String firstname, String lastname,
			String address, String mobileNo, String username, String password,
			String age) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.mobileNo = mobileNo;
		this.username = username;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Customer [userid=" + userid + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", address=" + address
				+ ", MobileNo=" + mobileNo + ", Username=" + username
				+ ", Password=" + password + ", age=" + age + "]";
	}
	
	
	
	
	

}
