package main.designpatterns.proxy.wrong;

public class SQLConnection implements Database{

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
