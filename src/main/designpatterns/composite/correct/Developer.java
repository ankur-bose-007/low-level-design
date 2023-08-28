package main.designpatterns.composite.correct;

public class Developer implements Employee {
    private final int id;
    private final String name;
    private final String position;

    Developer(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }
    @Override
    public String printDetails() {
        return "ID: " + id + " , name: " + name + " , position: " + position;
    }
}
