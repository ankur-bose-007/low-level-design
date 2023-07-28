package main.designpatterns.abstractfactory.wrong;

public class MacTextBox implements TextBox{
    @Override
    public void onInput() {
        System.out.println("input mac text");
    }
}
