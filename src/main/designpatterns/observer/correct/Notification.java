package main.designpatterns.observer.correct;

import java.util.List;

public class Notification {
    // This service ensures that we register listeners who are interested to receive notification
    // if any listener wants to be added subscribe() method is called
    // if a listener opts out of the service unsubscribe() method is called
    // this reduces chances of unnecessary notification events
    private List<Listener> listeners;

    Notification(List<Listener> listeners){
        // here the notification class depends on the abstraction rather than the implementation
        // of the listener objects. The job of listener is to only subscribe/unsubscribe the clients
        // and send notification without aware of the actual implementation of the listener.
        // Let's say we need to add fax notification in future we can simply implement Listener interface
        // and create FaxListener which will implement update() method this way we achieve open/closed
        // principle
        this.listeners = listeners;
    }

    public void subscribe(Listener listener){
        listeners.add(listener);
    }

    public void remove(Listener listener){
        listeners.remove(listener);
    }

    public void sendNotification(){
        listeners.forEach(s-> s.update());
    }
}
