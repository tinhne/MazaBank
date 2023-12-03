package com.example.mazabank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Account {
    private final StringProperty owner;
    private final StringProperty accountNumber;
    private final DoubleProperty balance;

    public Account(String owner, String aNumber, double balance){
        this.owner = new SimpleStringProperty(this, "Owner", owner);
        this.accountNumber = new SimpleStringProperty(this, "Account Number", aNumber);
        this.balance = new SimpleDoubleProperty(this, "Account Number", balance);
    }

    public StringProperty ownerProperty() {return owner; }
    public StringProperty accountProperty() {return accountNumber; }
    public DoubleProperty balanceProperty() {return balance; }
}
