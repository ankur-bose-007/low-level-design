package main.designpatterns.command.wrong;

public class PasteButton implements Button{
    @Override
    public void onClick() {
        System.out.println("paste event triggered");
    }
}
