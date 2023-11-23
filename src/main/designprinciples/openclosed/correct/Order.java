package main.designprinciples.openclosed.correct;

import java.util.List;

// Using this approach we can create as many shipping classes
// we want going forward. The only functionality that we have
// to implement is the getCost() method which is specific to
// the shipping type. This is an example of open closed principle
// where the parent Shipping is open to extension closed
// for modification.
public class Order {
    private final List<String> itemsList;

    private final Shipping shipping;

    Order(List<String> itemsList, Shipping shipping){
        this.itemsList = itemsList;
        this.shipping = shipping;
    }

    public int getTotal(){
        return itemsList.size();
    }

    public void printItems(){
        for(String item: itemsList)
            System.out.println(item);
    }

    public int getShippingCost(){
        return shipping.getCost(this);
    }
}
