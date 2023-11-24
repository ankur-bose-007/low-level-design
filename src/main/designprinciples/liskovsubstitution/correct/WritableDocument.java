package main.designprinciples.liskovsubstitution.correct;

public class WritableDocument extends Document{
    WritableDocument(String data, String fileName) {
        super(data, fileName);
    }

    public void save(String newData){
        open();

        System.out.println("saving new data" + newData);
    }
}
