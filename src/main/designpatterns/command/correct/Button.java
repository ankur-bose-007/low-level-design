package main.designpatterns.command.correct;

// Invoker
public class Button {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void onClick(){
        command.execute();
    }
}
