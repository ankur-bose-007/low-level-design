package main.designpatterns.command.correct;

// Concrete command
public class CopyCommand implements Command{
    private Operation operation;

    public CopyCommand(Operation operation){
        this.operation = operation;
    }

    @Override
    public void execute() {
        operation.copy();
    }
}
