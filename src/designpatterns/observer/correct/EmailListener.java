package designpatterns.observer.correct;

public class EmailListener implements Listener {
    private String email;

    public EmailListener(String email){
        this.email = email;
    }
    @Override
    public void update() {
        System.out.println("send email notification to " + email);
    }
}
