package main.designpatterns.strategy.correct;

public class Sorting {
    private SortingStrategy sortingStrategy;

    public Sorting(SortingStrategy sortingStrategy){
        // here we depend on the interface(abstraction) rather than static blocks of code or
        // direct instances(implementation). This makes the code loosely coupled and open to extension
        // a new class can be created for new sorting technique and user can pass the object at runtime
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(){
        sortingStrategy.sort();
    }
}
