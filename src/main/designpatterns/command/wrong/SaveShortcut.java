package main.designpatterns.command.wrong;

public class SaveShortcut implements Shortcut{

    @Override
    public void onPress() {
        System.out.println("save event triggered");
    }
}
