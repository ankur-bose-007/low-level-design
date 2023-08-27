package main.designpatterns.composite.wrong;

public class Developer implements Employee{
    private final int id;
    private final String name;

    Developer(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("emp id: " + id + ", name: " + name);
    }
}
