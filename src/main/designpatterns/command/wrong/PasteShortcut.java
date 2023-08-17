package main.designpatterns.command.wrong;

public class PasteShortcut implements Shortcut{
    @Override
    public void onPress() {
        System.out.println("paste event triggered");
    }
}
