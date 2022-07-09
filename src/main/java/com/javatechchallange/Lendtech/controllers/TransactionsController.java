package com.javatechchallange.Lendtech.controllers;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javatechchallange.Lendtech.models.Transactions;
import com.javatechchallange.Lendtech.repositories.TransactionsRepository;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionsController {
	
	@Autowired
	private TransactionsRepository transactionsRepository;
	//get all transactions for a customer
	@GetMapping("/loans/{id}/{fromDate}/{toDate}")
	public List<Transactions> getCustomerLoanTransactions(@PathVariable("id") long id,@PathVariable("fromDate") String fromDate,@PathVariable("toDate") String toDate) {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date date = null;
		try {
			date = sdf1.parse(fromDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date d1 = new java.sql.Date(date.getTime());
		
		try {
			date = sdf1.parse(toDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date d2 = new java.sql.Date(date.getTime());
		
		List<Transactions> rawData =  transactionsRepository.findAll();
		List<Transactions> results = new LinkedList<Transactions>();
		// && t.getTransactionDate().compareTo(d1) >= 0 
		for(Transactions t : rawData) {
			if(t.getFromCustomerID() == id && t.getTransactiontype() == 1 && t.getTransactionDate().compareTo(d1) >= 0  && t.getTransactionDate().compareTo(d2) <= 0) {
				results.add(t);
			}
		}
		return results;
	}
	
	
	@GetMapping("/payments/{id}")
	public List<Transactions> getCustomerPaymentsTransactions(@PathVariable("id") long id) {
		List<Transactions> rawData =  transactionsRepository.findAll();
		List<Transactions> results = new LinkedList<Transactions>();
		for(Transactions t : rawData) {
			if(t.getFromCustomerID() == id) {
				results.add(t);
			}
		}
		return results;
	}
	
	
	//post a transaction, e.g pay loan.
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Transactions transaction) {
		transactionsRepository.save(transaction);
	}
}
