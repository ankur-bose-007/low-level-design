package main.designpatterns.composite.correct;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private final int id;
    private final String name;
    private final String position;

    private final List<Employee> listOfEmployees = new ArrayList<>();

    Manager(int id, String name, String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }
    @Override
    public String printDetails() {
        StringBuilder empDetails = new StringBuilder("ID: " + id + " , name: " + name + " , position: " + position);
        for(Employee e: listOfEmployees){
            empDetails.append("\n");
            empDetails.append(e.printDetails());
        }

        return empDetails.toString();
    }

    public void addEmployee(Employee e){
        listOfEmployees.add(e);
    }

    public void removeEmployee(Employee e){
        listOfEmployees.remove(e);
    }
}
