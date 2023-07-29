package main.designpatterns.singleton;

public class EagerSingleton {
    // This implementation is thread safe, as the object is created during the
    // jvm startup phase and use of multiple threads won't make any changes
    // But, this can only be used when the object is not expensive in the
    // application
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public EagerSingleton getInstance(){
        return instance;
    }
}
