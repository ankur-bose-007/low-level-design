package main.designpatterns.decorator.correct;

public class Mushroom extends PizzaDecorator{
    Mushroom(Pizza basePizza) {
        super(basePizza);
    }

    private void addMushroom(){
        System.out.println("add mushroom topping");
    }

    public void makePizza(){
        basePizza.makePizza();
        addMushroom();
    }
}
