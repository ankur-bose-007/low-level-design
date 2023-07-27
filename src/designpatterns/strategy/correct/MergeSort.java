package designpatterns.strategy.correct;

public class MergeSort implements SortingStrategy{

    @Override
    public void sort() {
        System.out.println("sorting using merge sort");
    }
}
