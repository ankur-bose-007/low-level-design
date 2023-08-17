package main.designpatterns.command.correct;


// Receiver
public class Operation {
    public void save(){
        System.out.println("save executed");
    }

    public void copy(){
        System.out.println("copy executed");
    }

    public void paste(){
        System.out.println("paste executed");
    }
}
