package main.designpatterns.bridge.correct;

public class StandardDefinition implements PictureQuality{
    @Override
    public void process() {
        System.out.println("Processing SD quality");
    }
}
