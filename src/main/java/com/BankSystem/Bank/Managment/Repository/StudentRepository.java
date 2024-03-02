package com.BankSystem.Bank.Managment.Repository;

import com.BankSystem.Bank.Managment.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Customer,Integer> {
}
