package main.designpatterns.decorator.correct;

public class LoadedPizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println("Make loaded pizza");
    }
}
