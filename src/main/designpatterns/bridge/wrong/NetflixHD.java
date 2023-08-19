package main.designpatterns.bridge.wrong;

public class NetflixHD implements OTT{
    @Override
    public void play() {
        System.out.println("Playing netflix High Definition");
    }
}
