package main.designpatterns.facade.correct;

// In this implementation an extra layer of abstraction
// is created. The customer now doesn't need to bother
// about the library changes or the actual restaurant
// class. If a new type of restaurant is introduced in future
// the changes will take place in the library and the customer
// will just make use of the method exposed by the HotelKeeperImpl
// which is the Facade Implementation in our case.
public class Customer {
    public void order(){
        HotelKeeper hotelKeeper = new HotelKeeperImpl();

        hotelKeeper.getVegMenu();
        hotelKeeper.getNonVegMenu();
    }
}
