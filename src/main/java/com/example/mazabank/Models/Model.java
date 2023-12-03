package com.example.mazabank.Models;

import com.example.mazabank.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
//    client data section
    private Client client;
    private  boolean clientLoginSuccessFlag;

//    admin data section


    private Model() {
        this.viewFactory = new ViewFactory();
        this.databaseDriver = new DatabaseDriver();
        //    client data section
        this.clientLoginSuccessFlag = false;
        this.client = new Client("", "", "", null, null, null);
        //    admin data section

    }
    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }
    public DatabaseDriver getDatabaseDriver() {return databaseDriver; }

    /*
    * Client Method Section
    * */
    public boolean getClientLoginSuccessFlag() {return this.clientLoginSuccessFlag; }
    public void setClientLoginSuccessFlag(boolean flag) {this.clientLoginSuccessFlag = flag; }



    /*
     * Admin Method Section
     * */
}
