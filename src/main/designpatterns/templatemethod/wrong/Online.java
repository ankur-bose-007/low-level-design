package main.designpatterns.templatemethod.wrong;

public class Online {
    public void netPayment(){
        System.out.println("paid via netbanking/upi");
    }

    public void delivery(){
        System.out.println("doorstep delivery of product initiated");
    }
}
