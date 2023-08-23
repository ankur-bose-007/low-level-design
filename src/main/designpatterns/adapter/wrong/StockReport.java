package main.designpatterns.adapter.wrong;

public class StockReport {
    public XMLData getStockDataReport(){
        return new XMLData();
    }
}
