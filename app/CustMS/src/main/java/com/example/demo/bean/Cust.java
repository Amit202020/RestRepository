package com.example.demo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table
public class Cust {
	
	@Id
	private String custId;
	private String custName;
	private String custDesc;
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustDesc() {
		return custDesc;
	}
	public void setCustDesc(String custDesc) {
		this.custDesc = custDesc;
	}
	public Cust(String custId, String custName, String custDesc) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custDesc = custDesc;
	}
	public Cust() {
		super();
	}
	@Override
	public String toString() {
		return "Cust [custId=" + custId + ", custName=" + custName + ", custDesc=" + custDesc + "]";
	}
	

}
