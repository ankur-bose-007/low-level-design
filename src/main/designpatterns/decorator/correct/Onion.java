package main.designpatterns.decorator.correct;

public class Onion extends PizzaDecorator{
    Onion(Pizza basePizza) {
        super(basePizza);
    }

    private void addOnion(){
        System.out.println("add onion topping");
    }

    public void makePizza(){
        basePizza.makePizza();
        addOnion();
    }
}
