package main.designpatterns.abstractfactory.correct;

public class MacButton implements Button {
    @Override
    public void onClick() {
        System.out.println("clicked mac button");
    }
}
