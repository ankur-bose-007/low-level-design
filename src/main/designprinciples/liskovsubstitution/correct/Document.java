package main.designprinciples.liskovsubstitution.correct;

public class Document {
    private String fileName;

    private String data;

    Document(String data, String fileName){
        this.data = data;
        this.fileName = fileName;
    }
    public void open(){
        System.out.println("opening file" + fileName);
    }
}
