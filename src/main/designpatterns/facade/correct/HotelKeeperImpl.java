package main.designpatterns.facade.correct;

public class HotelKeeperImpl implements HotelKeeper{
    @Override
    public VegMenu getVegMenu() {
        return (VegMenu) new VegRestaurant().getMenu();
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        return (NonVegMenu) new NonVegRestaurant().getMenu();
    }
}
