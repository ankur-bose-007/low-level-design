package main.designpatterns.singleton;

// If a Singleton class extends a Superclass
// which is cloneable, on calling clone method
// in the singleton class will create new objects
// to avoid this phenomenon clone method is overridden
// in the singleton class and the same instance is
// returned if somebody calls the clone method on it.
class SuperClass implements Cloneable{
    int i = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class SingletonCloneable extends SuperClass {
    private static final SingletonCloneable instance = new SingletonCloneable();

    private SingletonCloneable(){}

    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
