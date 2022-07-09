package com.javatechchallange.Lendtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.TransactionTypes;

public interface TransactionTypesRepository extends JpaRepository<TransactionTypes, Long> {

}
