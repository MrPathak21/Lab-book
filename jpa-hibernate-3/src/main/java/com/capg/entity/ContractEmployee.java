package com.capg.entity;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class ContractEmployee extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "pay_rate")
	private BigInteger payrate;

	public ContractEmployee() {
		// no implementation
	}

	public ContractEmployee(Long empid, String empname, BigInteger payrate) {
		super(empid, empname);
		this.payrate = payrate;
	}

	public BigInteger getPayrate() {
		return payrate;
	}

	public void setPayrate(BigInteger payrate) {
		this.payrate = payrate;
	}

	@Override
	public String toString() {
		return String.format("payrate=%s, getEmpid()=%s,getEmpname()=%s", payrate, getEmpid(), getEmpname());
	}

}