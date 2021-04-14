package com.capg.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "all_employees")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "emp_type", length = 1, discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue(value = "E")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_id")
	private Long empid;

	@Column(name = "ename", length = 30)
	private String empname;

	public Employee() {
		// no implementation
	}

	public Employee(Long empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	@Override
	public String toString() {
		return String.format("empid=%s,empname=%s", empid, empname);
	}

}