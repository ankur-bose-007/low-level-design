package main.designpatterns.factory.correct;

public class Client {
    // With the introduction of ButtonFactory class the implementation of Button is
    // hidden from the client. In future if a new button type "android" is introduced
    // code changes in the client won't be required. If needed, the client will call the
    // ButtonFactory class and request for a new button type.
    public void clickButton() throws Exception {
        String buttonType = "windows-button";
        Button button = ButtonFactory.getButton(buttonType);
        button.onClick();
    }
}

