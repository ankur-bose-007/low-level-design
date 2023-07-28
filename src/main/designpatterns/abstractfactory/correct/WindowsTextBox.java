package main.designpatterns.abstractfactory.correct;

public class WindowsTextBox implements TextBox {
    @Override
    public void onInput() {
        System.out.println("input windows text");
    }
}
