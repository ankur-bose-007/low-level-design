package main.designprinciples.dependencyinversion.wrong;

public class MySQLDatabase {
    public void insert(String data){
        System.out.println("persisting :" + data);
    }

    public String find(String data){
        return "data of id:" + data + "dummy data";
    }
}
