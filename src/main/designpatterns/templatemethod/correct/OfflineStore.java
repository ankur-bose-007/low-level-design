package main.designpatterns.templatemethod.correct;

public class OfflineStore extends Store{

    @Override
    public void payment() {
        System.out.println("paid via cash to the counter");
    }

    @Override
    public void delivery() {
        System.out.println("item collected from counter");
    }
}
