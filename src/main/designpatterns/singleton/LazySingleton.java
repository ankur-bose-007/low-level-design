package main.designpatterns.singleton;

public class LazySingleton {
    // The problem with this type of approach is that it is not
    // thread safe. Imagine the singleton instance is not initialized
    // yet and two threads call the getInstance at the same time
    // two new objects will be created. Thus, making the implementation
    // wrong
    private static LazySingleton instance;

    private LazySingleton(){}

    public LazySingleton getInstance(){
        if(instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
