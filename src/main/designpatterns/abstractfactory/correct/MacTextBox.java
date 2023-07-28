package main.designpatterns.abstractfactory.correct;

public class MacTextBox implements TextBox {
    @Override
    public void onInput() {
        System.out.println("input mac text");
    }
}
