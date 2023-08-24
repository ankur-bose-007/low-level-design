package main.designpatterns.templatemethod.wrong;

// In this example we can clearly see that the Online
// and Offline stores are performing two similar steps
// collect the money and deliver the product. The way of
// implementation might be different. But, it becomes difficult
// for the customer to manage the orders. Also, the customer
// does not need to know about the underlying implementation of
// the whole order lifecycle. This is a suitable use case to
// take help of the template method design pattern.
public class Customer {
    public void order(){
        Online onlineStore = new Online();
        onlineStore.netPayment();
        onlineStore.delivery();

        Store offlineStore = new Store();
        offlineStore.cashPayment();
        offlineStore.collectOrder();
    }
}
