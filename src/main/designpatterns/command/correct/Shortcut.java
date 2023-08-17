package main.designpatterns.command.correct;

// Invoker
public class Shortcut {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void onPress(){
        command.execute();
    }
}
