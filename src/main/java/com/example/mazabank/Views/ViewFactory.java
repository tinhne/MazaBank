package com.example.mazabank.Views;

import com.example.mazabank.Controllers.Admin.AdminController;
import com.example.mazabank.Controllers.Client.ClientController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    private AccountType loginAccountType;
//    Client Views
    private final ObjectProperty<ClientMenuOptions> clientSelectMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionsView;
    private AnchorPane accountsView;

//    Admin View
    private final ObjectProperty<AdminMenuOptions> adminSelectMenuItem;
    private AnchorPane createClientView;
    private AnchorPane clientsView;
    private AnchorPane depositView;

    public ViewFactory() {
        this.loginAccountType = AccountType.CLIENT;
        this.clientSelectMenuItem = new SimpleObjectProperty<>();
        this.adminSelectMenuItem = new SimpleObjectProperty<>();
    }

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    /*
    *   Client Views section
    * */
    public ObjectProperty<ClientMenuOptions> getClientSelectMenuItem() {
        return clientSelectMenuItem;
    }

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                dashboardView = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public AnchorPane getTransactionsView() {
        if (transactionsView == null) {
            try {
                transactionsView = new FXMLLoader(getClass().getResource("/Fxml/Client/Transactions.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return transactionsView;
    }

    public AnchorPane getAccountsView() {
        if (accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/Fxml/Client/Accounts.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return accountsView;
    }


    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);

    }

    /*
    * Admin Section
    * */

    public ObjectProperty<AdminMenuOptions> getAdminSelectMenuItem() {
        return adminSelectMenuItem;
    }

    public AnchorPane getCreateClientView() {
        if (createClientView == null) {
            try {
                createClientView = new FXMLLoader(getClass().getResource("/Fxml/Admin/CreateClient.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return createClientView;
    }

    public AnchorPane getClientsView() {
        if (clientsView == null) {
            try {
                clientsView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Clients.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clientsView ;
    }

    public AnchorPane getDepositView() {
        if (depositView == null) {
            try {
                depositView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Deposit.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return depositView;
    }

    public void showAdminWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController adminController = new AdminController();
        loader.setController(adminController);
        createStage(loader);
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void createStage(FXMLLoader loader) {
        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Maza Bank");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}
