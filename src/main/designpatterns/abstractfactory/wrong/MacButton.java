package main.designpatterns.abstractfactory.wrong;

public class MacButton implements Button{
    @Override
    public void onClick() {
        System.out.println("clicked mac button");
    }
}
