package main.designpatterns.decorator.wrong;

// The problem with this implementation is that for every new
// type of topping a new class needs to be introduced. Here we
// can clearly see that inheritance has some limitations. This is
// a classic example where we should go for association instead
// and choose to use the decorator design pattern.
public class Customer {
    public void orderPizza(){
        Pizza pizza = new MushroomPizza();
        pizza.makePizza();
    }
}
