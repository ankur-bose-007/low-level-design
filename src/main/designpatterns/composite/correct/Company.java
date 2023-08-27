package main.designpatterns.composite.correct;
// In this implementation we can see that one structure
// is maintained for both employees and departments.
// The managers and developers are created first and their
// corresponding departments are created. When the company
// needs the details of all its employees under every
// department, those are added to the head department.
// The adoption of composite design pattern is possible
// in this use case because it maintains a hierarchy. In all
// the cases where our application can be represented using a
// hierarchy, composite design pattern can be used.
public class Company {
    public void showEmployeeDetails(){
        Manager m1 = new Manager(1, "Santosh");
        Manager m2 = new Manager(2, "Vivek");

        Developer d1 = new Developer(3, "Ram");
        Developer d2 = new Developer(4, "Shyam");

        Department engDepartment = new Department();
        engDepartment.addEmployee(d1);
        engDepartment.addEmployee(d2);

        Department manDepartment = new Department();
        manDepartment.addEmployee(m1);
        manDepartment.addEmployee(m2);

        Department headDepartment = new Department();
        headDepartment.addEmployee(engDepartment);
        headDepartment.addEmployee(manDepartment);
    }
}
