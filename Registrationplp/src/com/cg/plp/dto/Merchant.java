package com.cg.plp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merchanttab")
public class Merchant {
	@Id
	@Column(name="m_merchantid")
	Integer merchantid;
	@Column(name="m_vname")
	String vendorname;
	@Column(name="m_mobile")
	String mobileNo;
	@Column(name="m_address")
	String address;
	
	@Column(name="m_uname")
	String username;
	@Column(name="m_pwd")
	String password;
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Merchant(Integer merchantid, String vendorname, String mobileNo,
			String address, String username, String password) {
		super();
		this.merchantid = merchantid;
		this.vendorname = vendorname;
		this.mobileNo = mobileNo;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	public Integer getMerchantid() {
		return merchantid;
	}
	
	public String getMobileNo() {
		return mobileNo;
	}
	public String getAddress() {
		return address;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	
	public void setMerchantid() {
		this.merchantid = (int) (Math.random()*10000);
	}
	
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Merchant [merchantid=" + merchantid + ", vendorname="
				+ vendorname + ", mobileNo=" + mobileNo + ", address=" + address
				+ ", username=" + username + ", password=" + password + "]";
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	
	
	
	
	
	
}
