package main.designpatterns.composite.wrong;

import java.util.HashSet;
import java.util.Set;

public class CompanyDirectory {
    private final Set<Employee> listOfEmployees = new HashSet<>();

    public void addEmployee(Employee e){
        listOfEmployees.add(e);
    }

    public void removeEmployee(Employee e){
        listOfEmployees.remove(e);
    }

    public void showAllEmployeeDetails(){
        for(Employee e: listOfEmployees)
            e.showEmployeeDetails();
    }
}
