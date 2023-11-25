package main.designprinciples.dependencyinversion.correct;

public interface Database {
    public String find(String date);

    public void insert(String data);
}
