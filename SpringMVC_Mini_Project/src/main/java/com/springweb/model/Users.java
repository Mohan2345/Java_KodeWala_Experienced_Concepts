package com.springweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int ref_no;
	
	@Column
	private String fullName;
	
	@Column
	 private String mobile;
	
	@Column
	private String status;

	public Users() {
		super();
	}

	public Users(String fullName, String mobile, String status) {
		super();
		this.fullName = fullName;
		this.mobile = mobile;
		this.status = status;
	}

	public Users(String fullName, String mobile) {
		super();
		this.fullName = fullName;
		this.mobile = mobile;
	}

	public Users(int ref_no, String fullName, String mobile, String status) {
		super();
		this.ref_no = ref_no;
		this.fullName = fullName;
		this.mobile = mobile;
		this.status = status;
	}

	public int getRef_no() {
		return ref_no;
	}

	public void setRef_no(int ref_no) {
		this.ref_no = ref_no;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
