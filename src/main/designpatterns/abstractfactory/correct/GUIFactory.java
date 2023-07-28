package main.designpatterns.abstractfactory.correct;

public class GUIFactory {
    public static Factory createFactory(String osType){
        switch (osType){
            case "windows":
                return new WindowsFactory();
            case "mac":
                return new MacFactory();
        }

        return null;
    }
}
