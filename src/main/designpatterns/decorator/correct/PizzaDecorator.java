package main.designpatterns.decorator.correct;

public abstract class PizzaDecorator implements Pizza{
    protected Pizza basePizza;

    PizzaDecorator(Pizza basePizza){
        this.basePizza = basePizza;
    }

    public void makePizza(){
        basePizza.makePizza();
    }
}
