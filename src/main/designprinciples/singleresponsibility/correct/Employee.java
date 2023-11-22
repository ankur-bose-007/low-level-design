package main.designprinciples.singleresponsibility.correct;

// By applying single responsibility principle we ensure that the
// Employee class is only responsible for maintaining the employee
// data while the TimeSheetReport class has only one task which is
// to print the report. In the future, if there are changes in either
// of the classes it won't impact the other class.
public abstract class Employee {
    private String name;

    public abstract String getName();
}
