package com.javatechchallange.Lendtech.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customers {
	
	@Id
	@GeneratedValue(generator="sqlite")
	@TableGenerator(name="sqlite", table="hibernate_sequence",
	    pkColumnName="name", valueColumnName="seq",
	    pkColumnValue="customers")
	
	private long id;
	
	private int customertype;
	private int accountid;
	private String name;
	
	public int getCustomertype() {
		return customertype;
	}
	public void setCustomertype(int customertype) {
		this.customertype = customertype;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
