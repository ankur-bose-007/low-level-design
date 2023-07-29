package main.designpatterns.singleton;

public class LockedSingleton {
    // In this implementation the lock will only be acquired during the
    // instance creation phase. Post that all the calls will be thread-safe
    // anyway. This is the best implementation of singleton design pattern
    private static LockedSingleton instance;

    private LockedSingleton(){}

    public synchronized LockedSingleton getInstance(){
        if(instance == null){
            synchronized (LockedSingleton.class){
                // check again as multiple threads can reach the above block
                if(instance == null)
                    instance = new LockedSingleton();
            }
        }
        return instance;
    }
}
