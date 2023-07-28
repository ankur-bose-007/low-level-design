package main.designpatterns.abstractfactory.wrong;

public class Client {
    // The problem with this approach is, in case we introduce new components
    // in either mac or windows OS in future, the client has to make code changes
    // to support it. However, if we can expose factory classes to the client,
    // it doesn't need to worry about the implementation. This can be achieved by
    // AbstractFactory design pattern.
    public void operateGUI() throws Exception {

        Button button = null;
        TextBox textBox = null;
        String buttonType = "windows";
        String textBoxType = "macOS";

        switch(buttonType){
            case "windows":
                button = new WindowsButton();
                break;
            case "macOS":
                button = new MacButton();
                break;
            default:
                throw new Exception("Button type invalid");
        }

        switch(textBoxType){
            case "windows":
                textBox = new WindowsTextBox();
                break;
            case "macOS":
                textBox = new MacTextBox();
                break;
            default:
                throw new Exception("Button type invalid");
        }

        button.onClick();
        textBox.onInput();
    }
}
