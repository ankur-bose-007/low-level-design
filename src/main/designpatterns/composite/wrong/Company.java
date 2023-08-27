package main.designpatterns.composite.wrong;

// Here we can see that the managers and developers are all
// employees and could be part of separate directories or
// departments. Instead of adding the individual employees
// their whole departments could be added to the company
// directory. This can be easily achieved using the composite
// design pattern as we can see a hierarchy here.
public class Company {
    public void showEmployeeDetails(){
        Manager m1 = new Manager(1, "Santosh");
        Manager m2 = new Manager(2, "Vivek");

        Developer d1 = new Developer(3, "Ram");
        Developer d2 = new Developer(4, "Shyam");

        CompanyDirectory cd = new CompanyDirectory();
        cd.addEmployee(m1);
        cd.addEmployee(m2);
        cd.addEmployee(d1);
        cd.addEmployee(d2);

        cd.showAllEmployeeDetails();
    }
}
