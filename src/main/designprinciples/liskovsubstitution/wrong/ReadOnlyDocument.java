package main.designprinciples.liskovsubstitution.wrong;

public class ReadOnlyDocument extends Document{
    ReadOnlyDocument(String data, String fileName) {
        super(data, fileName);
    }

    public void save(){
        System.out.println("This is a read-only file");
    }
}
