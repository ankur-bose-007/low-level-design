package main.designpatterns.command.wrong;

public class CopyButton implements Button{
    @Override
    public void onClick() {
        System.out.println("copy event triggered");
    }
}
