package main.designpatterns.decorator.correct;

// This is a graceful implementation compared to the inheritance
// solution. We created a decorator wrapper on top of the base
// class. This enables us to create as much decorator classes
// we want which inherits the behaviour of the parent class and
// adds its own.
public class Customer {
    public void orderPizza(){
        Pizza pizza = new Onion(new Mushroom(new CheesePizza()));
        pizza.makePizza();
    }
}
