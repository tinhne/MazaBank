package com.example.mazabank.Views;

import com.example.mazabank.Controllers.Client.TransactionCellController;
import com.example.mazabank.Models.Transaction;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

import java.io.IOException;

public class TransactionCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean emty) {
        super.updateItem(transaction, emty);
        if (emty) {
            setText(null);
            setGraphic(null);
        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/TransactionCell"));
            TransactionCellController transactionCellController = new TransactionCellController(transaction);
            loader.setController(transactionCellController);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
