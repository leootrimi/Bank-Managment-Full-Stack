package com.BankSystem.Bank.Managment.Repository;
import com.BankSystem.Bank.Managment.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactinRepository extends JpaRepository<Transaction,Integer> {
}
