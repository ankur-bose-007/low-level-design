package main.designpatterns.facade.wrong;

public class VegMenu implements Menu{
    @Override
    public void getItems() {
        System.out.println("get veg items");
    }
}
