package main.designprinciples.liskovsubstitution.wrong;

public class Document {
    private final String data;
    private final String fileName;

    Document(String data, String fileName){
        this.data = data;
        this.fileName = fileName;
    }

    public void open(){
        System.out.println("open :" + fileName);
    }
    public void save(){
        System.out.println("Saving data :" + data);
    }
}
