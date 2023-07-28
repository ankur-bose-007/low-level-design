package main.designpatterns.factory.wrong;

public class Client {
    // The problem with this approach is, let's say tomorrow we introduce a new
    // button type "android button" in our library, the client has to add a new switch
    // condition to instantiate the button which is wrong. The role of factory design pattern
    // is to solve this issue. The client doesn't need to know the internal implementation of the library
    // and it's classes.
    public void clickButton() throws Exception {
        String componentType = "windows-button";
        Button button = null;

        switch(componentType) {
            case "windows-button":
                button = new WindowsButton();
                break;
            case "html-button":
                button = new HTMLButton();
                break;
            default:
                throw new Exception("button type not available");
        }

        button.onClick();
    }
}
