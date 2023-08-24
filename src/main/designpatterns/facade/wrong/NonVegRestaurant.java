package main.designpatterns.facade.wrong;

public class NonVegRestaurant implements Hotel{
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
