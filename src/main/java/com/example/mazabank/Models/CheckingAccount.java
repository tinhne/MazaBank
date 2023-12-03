package com.example.mazabank.Models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account{
//    the number of transaction a client is allowed to do per day
    private final IntegerProperty transactionLimit;


    public CheckingAccount(String owner, String aNumber, double balance, int tlimit) {
        super(owner, aNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "transaction limit", tlimit);
    }

    public IntegerProperty transactionLimitProp() {return transactionLimit; };
}
