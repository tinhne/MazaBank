package com.example.mazabank.Models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Client {
//    firstName, lastName, payeeAddress;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Account> checkingAccount;
    private final ObjectProperty<Account> savingAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String fName, String lName, String pAddress, Account cAccount, Account sAccount, LocalDate date) {
        this.firstName = new SimpleStringProperty(this, "FirstName", fName);
        this.lastName = new SimpleStringProperty(this, "LastName", lName);
        this.payeeAddress = new SimpleStringProperty(this, "PayeeAddress", pAddress);
        this.checkingAccount = new SimpleObjectProperty<>(this, "Checking Account", cAccount);
        this.savingAccount = new SimpleObjectProperty<>(this, "Saving Account", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "Date create", date);
    }

    public StringProperty firstNameProperty() {return firstName; }
    public StringProperty lastNameProperty() {return lastName; }
    public StringProperty payeePropertyProperty() {return payeeAddress; }
    public ObjectProperty<Account> checkingAccountProperty() {return checkingAccount; }

    public ObjectProperty<Account> savingAccountProperty() {return savingAccount; }
    public ObjectProperty<LocalDate> dateCreatedProperty() {return dateCreated; }
}
