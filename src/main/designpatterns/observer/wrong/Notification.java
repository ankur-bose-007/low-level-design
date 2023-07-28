package main.designpatterns.observer.wrong;

import java.util.List;

public class Notification {
    private List<String> customerEmailList;

    Notification(List<String> customerEmailList){
        // the problem with this approach is that in future if we want to add another
        // notification type like sms or fax we have to make changes in this class
        // which violates several SOLID principles like Open Closed, Dependency Inversion
        this.customerEmailList = customerEmailList;
    }

    public void sendNotification(){
        customerEmailList.forEach(email -> System.out.println("sent email to " + email));
    }
}
