package com.javatechchallange.Lendtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.CurrentAccounts;

public interface CurrentAccountsRepository extends JpaRepository<CurrentAccounts, Long> {

}
