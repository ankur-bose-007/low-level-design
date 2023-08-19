package main.designpatterns.bridge.wrong;

public class NetflixSD implements OTT{
    @Override
    public void play() {
        System.out.println("Playing Netflix Standard Definition");
    }
}
