package main.designpatterns.factory.correct;

public class ButtonFactory {
    public static Button getButton(String type) throws Exception {
        switch(type){
            case "windows-button":
                return new WindowsButton();
            case "html-button":
                return new HTMLButton();
            default:
                throw new Exception("Button type not found");
        }
    }
}
