package com.javatechchallange.Lendtech.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javatechchallange.Lendtech.models.Customers;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomersController {
	@GetMapping
	public List<Customers> list(){
		List<Customers> customers = new ArrayList<Customers>();
		return customers;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Customers customer) {
		
	}
	
	@GetMapping("/{id}")
	public Customers get(@PathVariable("id") long id) {
		return new Customers();
	}
}
