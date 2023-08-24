package main.designpatterns.facade.wrong;

public class VegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
