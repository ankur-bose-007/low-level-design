package main.designpatterns.composite.correct;

public class Developer implements Employee {
    private int id;
    private String name;

    Developer(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("emp id: " + id + ", name: " + name);
    }
}
