package com.javatechchallange.Lendtech.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechchallange.Lendtech.models.LoanAccounts;

public interface LoanAccountsRepository extends JpaRepository<LoanAccounts, Long> {

	//public List<LoanAccounts> findByCustomerID(long customerID);
}
