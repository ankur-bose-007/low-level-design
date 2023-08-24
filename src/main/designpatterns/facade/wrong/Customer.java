package main.designpatterns.facade.wrong;

// Here we can see the Customer is directly creating the
// restaurant object of the type of restaurant and getting
// the menu. Let's assume in future a new menu comes in
// which has both veg and non-veg the customer has to
// create a new restaurant object and get that menu. This
// is a classic example where the Facade pattern can be used
// to present the menu presentation in a simpler way.
public class Customer {
    public void order(){
        Hotel hotel = new NonVegRestaurant();
        hotel.getMenu();
        hotel = new VegRestaurant();
        hotel.getMenu();
    }
}
