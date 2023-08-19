package main.designpatterns.decorator.wrong;

public class CheesePizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println("Create cheese pizza");
    }
}
