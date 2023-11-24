package com.example.mazabank.Controllers.Admin;

import com.example.mazabank.Models.Model;
import com.example.mazabank.Views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {
    public Button create_client_btn;
    public Button clients_btn;
    public Button deposit_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListener();
    }
    public void addListener() {
        create_client_btn.setOnAction(actionEvent -> onCreateClient());
        clients_btn.setOnAction(actionEvent -> onClients());
        deposit_btn.setOnAction(actionEvent -> onDeposit());
    }

    private void onCreateClient() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void onClients() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void onDeposit() {
        Model.getInstance().getViewFactory().getAdminSelectMenuItem().set(AdminMenuOptions.DEPOSIT);
    }
}
