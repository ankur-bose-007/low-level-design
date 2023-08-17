package main.designpatterns.command.wrong;

public class SaveButton implements Button{

    @Override
    public void onClick() {
        System.out.println("save event triggered");
    }
}
