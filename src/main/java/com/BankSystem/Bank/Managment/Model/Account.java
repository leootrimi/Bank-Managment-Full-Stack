package com.BankSystem.Bank.Managment.Model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.time.LocalDate;

@Entity
@Table(name = "account")
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
@ManyToOne
    private Customer customer;
    private String accountType;
    private Double balance;
    private LocalDate openDate;

    public Account(){}

    public Account(Long accountId, Customer customer, String accountType, Double balance, LocalDate openDate) {
        this.accountId = accountId;
        this.customer = customer;
        this.accountType = accountType;
        this.balance = balance;
        this.openDate = openDate;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }
}
