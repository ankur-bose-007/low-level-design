package main.designpatterns.abstractfactory.correct;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("clicked windows button");
    }
}
