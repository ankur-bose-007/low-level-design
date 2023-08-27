package main.designpatterns.composite.correct;

import java.util.HashSet;
import java.util.Set;

public class Department implements Employee {
    private final Set<Employee> listOfEmployees = new HashSet<>();

    @Override
    public void showEmployeeDetails() {
        for(Employee emp: listOfEmployees)
            emp.showEmployeeDetails();
    }

    public void addEmployee(Employee e){
        listOfEmployees.add(e);
    }

    public void removeEmployee(Employee e){
        listOfEmployees.remove(e);
    }
}
