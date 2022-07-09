package com.javatechchallange.Lendtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.CustomerType;

public interface CustomerTypeRepository extends JpaRepository<CustomerType, Long> {

}
