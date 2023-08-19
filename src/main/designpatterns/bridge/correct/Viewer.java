package main.designpatterns.bridge.correct;

// In this implementation we can see that there is a separation
// of concern among the entities OTT and PictureQuality. The OTT
// class contains PictureQuality entity which helps it to process
// the type of video quality based on the user input. Using bridge
// design pattern we reduce a lot of classes and make classes more
// independent using abstraction and implementation.
public class Viewer {
    public void watch(){
        PictureQuality hd = new HighDefinition();
        PictureQuality sd = new StandardDefinition();

        OTT netflixHD = new Netflix(hd);
        netflixHD.play();

        OTT primeVideoSD = new PrimeVideo(sd);
        primeVideoSD.play();
    }
}
