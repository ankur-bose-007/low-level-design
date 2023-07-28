package main.designpatterns.strategy.wrong;

public class Sorting {
    public void sort(String sortType){
        switch (sortType){
            case "bubble":
                System.out.println("sorting using bubble");
                break;
            case "merge":
                System.out.println("sorting using merge");
                break;
            case "quick":
                System.out.println("sorting using quick");
                break;
            // adding new sorting will make the developer change this class which is violating Open Closed
            // principle of SOLID
            default:
                System.out.println("some other sorting");
        }
    }
}
