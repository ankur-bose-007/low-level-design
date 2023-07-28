package main.designpatterns.observer.correct;

public class SmsListener implements Listener{
    private String phone;

    public SmsListener(String phone){
        this.phone = phone;
    }

    @Override
    public void update() {
        System.out.println("send sms notification to " + phone);
    }
}
