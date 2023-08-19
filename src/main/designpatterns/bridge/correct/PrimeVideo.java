package main.designpatterns.bridge.correct;

public class PrimeVideo extends OTT{

    PrimeVideo(PictureQuality pictureQuality) {
        super(pictureQuality);
    }

    @Override
    public void play() {
        pictureQuality.process();
    }
}
