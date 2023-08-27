package main.designpatterns.composite.wrong;

public class Manager implements Employee{
    private final int id;
    private final String name;

    Manager(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("emp id: " + id + ", name: " + name);
    }
}
