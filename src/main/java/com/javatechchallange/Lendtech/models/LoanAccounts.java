package com.javatechchallange.Lendtech.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="loan_accounts")
public class LoanAccounts {
	
	@Id
	@GeneratedValue(generator="sqlite")
	@TableGenerator(name="sqlite", table="hibernate_sequence",
	    pkColumnName="name", valueColumnName="seq",
	    pkColumnValue="loan_accounts")
	
	private long id;
	
	private int customerID;
	private BigDecimal accountBalance;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyy")
	private Date lastUpdated;
	

	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public BigDecimal getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
