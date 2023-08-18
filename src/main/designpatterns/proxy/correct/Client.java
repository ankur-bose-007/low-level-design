package main.designpatterns.proxy.correct;

// Notice in this implementation the client is creating the SQLProxy
// instead of the actual class. The SQLProxy internally loads the
// SQLConnection class lazily. Now no matter how many times the client
// initializes the SQLConnection. The heavy initialisation code will only
// run once. This example is quite similar to Singleton pattern but not to be
// confused as both are serving different purposes. Singleton is a creational
// design pattern where we solve the problem of objection creation while
// Proxy is a structural design pattern where we try to structure the objects
// such that it helps us avoid repetition and optimise our solution. Proxy also
// helps in creating an extra layer of abstraction.
public class Client {
    public void process(){
        Database db = new SQLConnectionProxy();
        db.createConnection();
    }
}
