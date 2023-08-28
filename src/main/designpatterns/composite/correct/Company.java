package main.designpatterns.composite.correct;

// In this implementation it becomes easier for us to print the details
// as the manager class already holds the information of it's subordinates
// we just need to call the printDetails() method. Consider a case where
// there would be a director with multiple managers reporting to that person.
// Calling the printDetails() method would print details of all the hierarchy.
public class Company {
    public void getAllEmployeesList(){

        Manager m1 = new Manager(1, "manager 1", "manager");
        Developer d1 = new Developer(2, "developer 1", "senior developer");
        Developer d2 = new Developer(3, "developer 2", "junior developer");
        Tester t1 = new Tester(4, "tester 1", "testing lead");

        m1.addEmployee(d1);
        m1.addEmployee(d2);
        m1.addEmployee(t1);

        m1.printDetails();
    }
}
