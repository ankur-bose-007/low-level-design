package main.designpatterns.bridge.wrong;


// In this way of implementation the OTT classes and picture quality
// are coupled and created as a single class. In reality these are
// different dimensions. The OTT class can be separated from the type
// of picture quality and can be independently invoked. The Bridge
// design pattern can help us solve this issue.
public class Viewer {
    public void watch(){
        OTT ott = null;
        ott = new NetflixHD();
        ott.play();
        ott = new PrimeSD();
        ott.play();
    }
}
