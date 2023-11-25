package main.designprinciples.dependencyinversion.correct;

public class MySQLDatabase implements Database{
    @Override
    public String find(String date) {
        return "dummy data";
    }

    @Override
    public void insert(String data) {
        System.out.println("persisting data " + data);
    }
}
