package com.example.mazabank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class SavingAccount extends Account {
//    The withdrawal limit from the saving account
    private final DoubleProperty withdrawalLimit;


    public SavingAccount(String owner, String aNumber, double balance, double wLimit) {
        super(owner, aNumber, balance);
        this.withdrawalLimit = new SimpleDoubleProperty(this, "Withdrawal Limit", wLimit);
    }

    public DoubleProperty WithdrawalLimitProp() {return withdrawalLimit; }
}
