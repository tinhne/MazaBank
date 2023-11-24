package com.example.mazabank.Controllers.Client;

import com.example.mazabank.Models.Model;
import com.example.mazabank.Views.ClientMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {

    public Button dashboard_btn;
    public Button transactions_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;
    public Button report_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }
    private void addListeners() {
        dashboard_btn.setOnAction(actionEvent -> onDashboard());
        transactions_btn.setOnAction(actionEvent -> onTransactions());
        accounts_btn.setOnAction(actionEvent -> onAccounts());
    }

    private void onAccounts() {
        Model.getInstance().getViewFactory().getClientSelectMenuItem().set(ClientMenuOptions.ACCOUNTS);
    }

    private void onTransactions() {
        Model.getInstance().getViewFactory().getClientSelectMenuItem().set(ClientMenuOptions.TRANSACTIONS);
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectMenuItem().set(ClientMenuOptions.DASHBOARD);
    }

}
