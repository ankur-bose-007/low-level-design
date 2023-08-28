package main.designpatterns.composite.wrong;

import java.util.ArrayList;
import java.util.List;

// In this implementation it becomes very tedious when the hierarchy
// grows. The user has to go through every employee individually and
// add them manually. Also, consider a situation where the subordinates
// of the manager are already linked, but you do not know the number of
// objects it holds. In such cases iterating over the elements would be
// very difficult. This problem can be solved using composite design
// pattern.
public class Company {
    public void getAllEmployeesList(){

        Manager m1 = new Manager(1, "manager 1", "manager");
        Developer d1 = new Developer(2, "developer 1", "senior developer");
        Developer d2 = new Developer(3, "developer 2", "junior developer");
        Tester t1 = new Tester(4, "tester 1", "testing lead");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(m1);
        employeeList.add(d1);
        employeeList.add(d2);
        employeeList.add(t1);

        for(Employee e: employeeList)
            System.out.println(e.printDetails());
    }
}
