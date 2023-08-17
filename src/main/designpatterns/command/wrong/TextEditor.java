package main.designpatterns.command.wrong;

public class TextEditor {
    // In this method the number of subclasses increase for each button/shortcut
    // type which becomes very difficult to manage. Imagine a change comes up
    // in the base Button class/interface this would risk breaking the logic
    // in the child classes inheriting from it.
    // Also, it can be observed that the save button and save shortcut does
    // the same operation leading to duplication of code. This can be gracefully
    // handled with the use of command design pattern
    public void clientOperations(String operation) throws Exception {
        switch (operation){
            case "click-copy":
                new CopyButton().onClick();
                break;
            case "ctrl+c":
                new CopyShortcut().onPress();
                break;
            case "click-save":
                new SaveButton().onClick();
                break;
            case "ctrl+s":
                new SaveShortcut().onPress();
                break;
            default:
                throw new Exception("invalid operation");
        }
    }
}
