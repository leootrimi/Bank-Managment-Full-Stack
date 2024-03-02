package com.BankSystem.Bank.Managment.Repository;
import com.BankSystem.Bank.Managment.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
