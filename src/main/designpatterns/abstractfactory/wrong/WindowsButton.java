package main.designpatterns.abstractfactory.wrong;

public class WindowsButton implements Button{
    @Override
    public void onClick() {
        System.out.println("clicked windows button");
    }
}
