package main.designpatterns.facade.wrong;

public class NonVegMenu implements Menu{

    @Override
    public void getItems() {
        System.out.println("get non-veg items");
    }
}
