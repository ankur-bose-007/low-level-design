package main.designpatterns.proxy.wrong;

// In this example the client is trying to create a multiple SQLConnection object
// and this would call the initialization phase multiple times
// which is unnecessary. The client is unaware of this heavy initialization code
// that is running everytime. This can be solved using proxy design pattern.
public class Client {
    public void process(){
        Database db = new SQLConnection();
        db.createConnection();
        db = new SQLConnection();
        db.createConnection();
    }
}
