package main.designpatterns.adapter.correct;

public class StockReport implements Report{
    @Override
    public Data getData() {
        return new XMLData();
    }
}
