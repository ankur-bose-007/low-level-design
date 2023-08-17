package main.designpatterns.command.wrong;

public class CopyShortcut implements Shortcut{

    @Override
    public void onPress() {
        System.out.println("copy event triggered");
    }
}
