package designpatterns.strategy.correct;

public class BubbleSort implements Sorting {
    @Override
    public void sort() {
        System.out.println("sorting using bubble sort");
    }
}
