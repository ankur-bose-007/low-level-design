package main.designpatterns.bridge.correct;

public abstract class OTT {
    protected PictureQuality pictureQuality;

    OTT(PictureQuality pictureQuality){
        this.pictureQuality = pictureQuality;
    }

    public abstract void play();
}
