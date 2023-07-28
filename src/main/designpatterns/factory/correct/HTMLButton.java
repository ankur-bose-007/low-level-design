package main.designpatterns.factory.correct;

public class HTMLButton implements Button{

    @Override
    public void onClick() {
        System.out.println("clicked html button");
    }
}
