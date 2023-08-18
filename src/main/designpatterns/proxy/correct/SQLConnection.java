package main.designpatterns.proxy.correct;

import main.designpatterns.proxy.wrong.Database;

public class SQLConnection implements Database {

    SQLConnection(){
        initialization();
    }

    private void initialization(){
        System.out.println("Initialization of SQL db");
    }

    @Override
    public void createConnection() {
        System.out.println("Created SQL connection");
    }
}
