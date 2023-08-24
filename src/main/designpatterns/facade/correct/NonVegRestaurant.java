package main.designpatterns.facade.correct;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
