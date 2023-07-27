package designpatterns.strategy.correct;

public class QuickSort implements SortingStrategy {

    @Override
    public void sort() {
        System.out.println("sorting using quick sort");
    }
}
