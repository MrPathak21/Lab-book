package com.capg.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "M")
public class Manager extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "bonus")
	private BigInteger bonus;

	public Manager() {
		// no implementation
	}

	public Manager(Long empid, String empname, BigInteger bonus) {
		super(empid, empname);
		this.bonus = bonus;
	}

	public BigInteger getBonus() {
		return bonus;
	}

	public void setBonus(BigInteger bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return String.format("bonus=%s, getEmpid()=%s,getEmpname()=%s", bonus, getEmpid(), getEmpname());
	}
}