package com.javatechchallange.Lendtech.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Transactions {
	@Id
	@GeneratedValue(generator="sqlite")
	@TableGenerator(name="sqlite", table="hibernate_sequence",
	    pkColumnName="name", valueColumnName="seq",
	    pkColumnValue="transactions")
	
	private long id;
	
	private int transactiontype;
	private int fromCustomerID;
	private int toCustomerID;
	private int toAccountType;
	private BigDecimal amount;
	private BigDecimal account_balance;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date transactionDate;
	
	public int getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(int transactiontype) {
		this.transactiontype = transactiontype;
	}
	public int getFromCustomerID() {
		return fromCustomerID;
	}
	public void setFromCustomerID(int fromCustomerID) {
		this.fromCustomerID = fromCustomerID;
	}
	public int getToCustomerID() {
		return toCustomerID;
	}
	public void setToCustomerID(int toCustomerID) {
		this.toCustomerID = toCustomerID;
	}
	public int getToAccountType() {
		return toAccountType;
	}
	public void setToAccountType(int toAccountType) {
		this.toAccountType = toAccountType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(BigDecimal account_balance) {
		this.account_balance = account_balance;
	}
}
