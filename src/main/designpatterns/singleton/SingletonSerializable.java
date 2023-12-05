package main.designpatterns.singleton;

import java.io.Serializable;


// If a singleton class implements serializable
// multiple instances of it can be created.
// To avoid this readResolve is implemented.
public class SingletonSerializable implements Serializable {
    private static final SingletonSerializable instance = new SingletonSerializable();

    private SingletonSerializable(){}

    protected Object readResolve(){return instance;}
}
