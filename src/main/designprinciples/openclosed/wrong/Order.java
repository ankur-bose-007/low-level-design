package main.designprinciples.openclosed.wrong;

import java.util.List;


// We have an order class which helps us manage shipping orders.
// The class has a method getShippingCost() which helps calculates
// the shipping cost of an order based on the total items and the
// mode of shipping. The problem arises when we want to add a new
// shipping mode say water. If we modify the existing class it
// might break the existing functionality.
public class Order {
    private final List<String> itemsList;

    private final String shippingType;

    Order(List<String> itemsList, String shippingType){
        this.itemsList = itemsList;
        this.shippingType = shippingType;
    }

    public int getTotal(){
        return itemsList.size();
    }

    public void printItems(){
        for(String item: itemsList)
            System.out.println(item);
    }

    public int getShippingCost(){
        if(shippingType.equals("air"))
            return 2 * getTotal();
        else
            return getTotal();
    }
}
