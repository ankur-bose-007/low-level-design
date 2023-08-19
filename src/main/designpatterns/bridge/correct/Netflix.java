package main.designpatterns.bridge.correct;

public class Netflix extends OTT{

    Netflix(PictureQuality pictureQuality) {
        super(pictureQuality);
    }

    @Override
    public void play() {
        pictureQuality.process();
    }
}
