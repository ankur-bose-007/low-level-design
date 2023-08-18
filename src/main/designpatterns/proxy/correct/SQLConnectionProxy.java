package main.designpatterns.proxy.correct;

public class SQLConnectionProxy implements Database {
    private static SQLConnection sqlConnection;
    @Override
    public void createConnection() {
        if(sqlConnection == null)
            sqlConnection = new SQLConnection();

        sqlConnection.createConnection();
    }
}
