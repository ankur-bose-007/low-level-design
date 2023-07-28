package main.designpatterns.strategy.correct;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort() {
        System.out.println("sorting using bubble sort");
    }
}
