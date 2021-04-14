package com.cg.jhd.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emps")
public class Employee {

	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long eid;
	
	@Column(name = "full_name", length = 30)
	private String fullName;
	
	@Column(name = "mobile", length = 10)
	private String mobile;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
	public Employee() {
		// default constructor;
	}

	public Employee(String fullName, String mobile) {
		super();
		this.fullName = fullName;
		this.mobile = mobile;
	}

	public Long getEid() {
		return eid;
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return String.format("eid=%s, fullName=%s, mobile=%s",eid,fullName,mobile);
	}
	
	
}
