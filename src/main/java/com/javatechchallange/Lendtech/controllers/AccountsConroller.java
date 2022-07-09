package com.javatechchallange.Lendtech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechchallange.Lendtech.models.CurrentAccounts;
import com.javatechchallange.Lendtech.models.LoanAccounts;
import com.javatechchallange.Lendtech.repositories.CurrentAccountsRepository;
import com.javatechchallange.Lendtech.repositories.LoanAccountsRepository;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsConroller {
	
	@Autowired
	private CurrentAccountsRepository currentAccountsRepository;
	
	@Autowired
	private LoanAccountsRepository loanAccountsRepository;
	//get all transactions for a customer
	@GetMapping("/loan/{id}")
	public LoanAccounts getCustomerLoanAcc(@PathVariable("id") long id) {
		List<LoanAccounts> rawData =  loanAccountsRepository.findAll();
		LoanAccounts lc = new LoanAccounts();
		for(LoanAccounts l : rawData) {
			if(l.getCustomerID() == id) {
				lc = l;
				break;
			}
		}
		return lc;
		
	}
	
	
	@GetMapping("/current/{id}")
	public CurrentAccounts getCustomerCurrentAcc(@PathVariable("id") long id) {
		List<CurrentAccounts> rawData =  currentAccountsRepository.findAll();
		CurrentAccounts ca = new CurrentAccounts();
		for(CurrentAccounts l : rawData) {
			if(l.getCustomerID() == id) {
				ca = l;
				break;
			}
		}
		return ca;
		
	}
}
