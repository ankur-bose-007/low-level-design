package main.designpatterns.facade.correct;

public class VegMenu implements Menu {
    @Override
    public void getItems() {
        System.out.println("get veg items");
    }
}
