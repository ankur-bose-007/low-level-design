package main.designpatterns.templatemethod.correct;

public class OnlineStore extends Store{
    @Override
    public void payment() {
        System.out.println("paid via online mode");
    }

    @Override
    public void delivery() {
        System.out.println("initiate doorstep delivery");
    }
}
