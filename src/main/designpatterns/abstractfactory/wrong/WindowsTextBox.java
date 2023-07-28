package main.designpatterns.abstractfactory.wrong;

public class WindowsTextBox implements TextBox{
    @Override
    public void onInput() {
        System.out.println("input windows text");
    }
}
