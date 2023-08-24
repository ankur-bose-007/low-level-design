package main.designpatterns.templatemethod.correct;

public abstract class Store {
    public void processOrder(){
        payment();
        delivery();
    }

    public abstract void payment();
    public abstract void delivery();
}
