package main.designpatterns.decorator.wrong;

public class LoadedPizza implements Pizza{
    @Override
    public void makePizza() {
        System.out.println("Create loaded pizza");
    }
}
