package main.designpatterns.command.correct;

// Concrete command
public class SaveCommand implements Command{

    private Operation operation;

    public SaveCommand(Operation operation){
        this.operation = operation;
    }

    @Override
    public void execute() {
        operation.save();
    }
}
