module com.example.mazabank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.example.mazabank to javafx.fxml;
    exports com.example.mazabank;
    exports com.example.mazabank.Controllers;
    exports com.example.mazabank.Controllers.Admin;
    exports com.example.mazabank.Controllers.Client;
    exports com.example.mazabank.Models;
    exports com.example.mazabank.Views;
}