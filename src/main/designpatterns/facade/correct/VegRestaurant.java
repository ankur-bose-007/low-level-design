package main.designpatterns.facade.correct;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
