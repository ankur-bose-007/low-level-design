package main.designpatterns.singleton;

public class SynchronizedSingleton {
    // In this implementation the getInstance() method is declared
    // synchronized which makes the implementation thread-safe.
    // However, each time a thread calls the getInstance() method
    // synchronized acquires a lock at method level which is quite
    // expensive and makes the app performance slow. This issue can
    // be solved by using block level locking
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){}

    public synchronized SynchronizedSingleton getInstance(){
        if(instance == null)
            instance = new SynchronizedSingleton();
        return instance;
    }
}
