package main.designpatterns.templatemethod.wrong;

public class Store {
    public void cashPayment(){
        System.out.println("paid using cash");
    }

    public void collectOrder(){
        System.out.println("collected item from the counter");
    }
}
