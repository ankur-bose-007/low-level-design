package main.designpatterns.abstractfactory.correct;

public class Client {
    // With this implementation let's say in future we introduce a new
    // GUI OS "Linux". The client doesn't need to do much changes in the code
    // it can request the GUI Factory to provide LinuxFactory and
    // easily create the button/textbox components without having to
    // worry about the underlying implementation.
    public void operateGUI(){
        Button button = null;
        TextBox textBox = null;

        Factory factory = GUIFactory.createFactory("mac");

        button = factory.createButton();
        textBox = factory.createTextBox();

        button.onClick();
        textBox.onInput();
    }
}
