package main.designpatterns.decorator.correct;

public class CheesePizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println("Make cheese pizza");
    }
}
