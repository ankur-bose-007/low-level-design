package main.designpatterns.adapter.wrong;
// In this implementation let's say tomorrow the client needs
// the data to be presented in Json format instead of XML
// we need to either ask the client to modify code at their
// end or the StockReport library. This could break the existing
// functionality. Also, we might not always have the privilege
// to modify the code of library/client. In this case the best
// is the use Adapter pattern.
public class Client {
    public void readData(){
        StockReport report = new StockReport();
        Data xmlData = report.getStockDataReport();
    }
}
