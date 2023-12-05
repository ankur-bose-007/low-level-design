package main.designpatterns.singleton;

// Singleton classes can be broken using reflection.
// If we use reflection and set the private Constructor
// to public we will be able to create more instances
// which violates the concept of Singleton classes.
// The solution is to create a Singleton enum. As enums
// are instantiated only once in the beginning and with
// private constructor, it cannot be created using reflection
public enum SingletonEnum {
    INSTANCE;
}
