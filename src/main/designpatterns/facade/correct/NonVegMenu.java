package main.designpatterns.facade.correct;

public class NonVegMenu implements Menu {

    @Override
    public void getItems() {
        System.out.println("get non-veg items");
    }
}
