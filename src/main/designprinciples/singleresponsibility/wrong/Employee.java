package main.designprinciples.singleresponsibility.wrong;


// The problem with this approach is that Employee class is responsible for
// two tasks, managing employee data and time sheet report. This class might
// have two reasons to change. Either change in employee data or let's say the
// format of the report changes over time. Hence, it will be better if we
// use single responsibility principle and create two separate classes for
// the two objectives.
public abstract class Employee {
    private int empId;
    private String name;

    public String printEmployeeDetails(){
        return "id: " + empId + " , name: " + name;
    }

    abstract String printTimeSheetReport();
}
