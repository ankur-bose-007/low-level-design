package main.designpatterns.templatemethod.correct;

// In this method, it becomes very easy for the customer
// to place the order. The customer doesn't need to worry
// about the internal working of the payment or delivery.
// So any changes in those method won't break the existing
// code.
public class Customer {
    public void order(){
        Store store = new OnlineStore();
        store.processOrder();
        store = new OfflineStore();
        store.processOrder();
    }
}
