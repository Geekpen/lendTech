package com.javatechchallange.Lendtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.Transactions;

public interface TransactionsRepository extends JpaRepository<Transactions, Long> {

}
