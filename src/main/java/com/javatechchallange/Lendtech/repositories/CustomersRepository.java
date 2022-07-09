package com.javatechchallange.Lendtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
