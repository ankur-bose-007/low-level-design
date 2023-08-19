package main.designpatterns.decorator.wrong;

public class MushroomPizza extends LoadedPizza{
    public void makePizza(){
        super.makePizza();
        System.out.println("Add mushroom in loaded pizza");
    }
}
