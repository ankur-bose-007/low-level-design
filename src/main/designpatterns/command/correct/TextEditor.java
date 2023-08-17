package main.designpatterns.command.correct;

// In this way we are achieving abstraction when it comes to the individual
// operations like save, copy, paste etc. The change in save/copy/paste logic
// is not going to break the functionality of how the button or shortcut performs
// the operation.
// Also, one button/shortcut can be used to perform multiple operations. We don't
// have to create separate classes for each button type. The operation of the element
// will solely depend on the command type it is passing as the argument.
public class TextEditor {

    public void clientOperations(String operation) throws Exception {
        Button button = new Button();
        Shortcut shortcut = new Shortcut();
        Operation operationObject = new Operation();
        Command command;

        switch (operation){
            case "click-copy":
                command = new CopyCommand(operationObject);
                button.setCommand(command);
                button.onClick();
                break;
            case "ctrl+c":
                command = new CopyCommand(operationObject);
                shortcut.setCommand(command);
                shortcut.onPress();
                break;
            case "click-save":
                command = new SaveCommand(operationObject);
                button.setCommand(command);
                button.onClick();
                break;
            case "ctrl+s":
                command = new SaveCommand(operationObject);
                shortcut.setCommand(command);
                shortcut.onPress();
                break;
            default:
                throw new Exception("invalid operation");
        }
    }
}
