package main.designpatterns.bridge.correct;

public class HighDefinition implements PictureQuality{
    @Override
    public void process() {
        System.out.println("Processing HD quality");
    }
}
