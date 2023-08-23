package main.designpatterns.adapter.correct;
// As a workaround we took help of adapter design pattern
// where we created a wrapper called StockReportAdapter. This
// wrapper internally converts the XML data to Json Data as
// per the client requirement keeping the implementation hidden
// and without any changes in the library.
public class Client {
    public void readData(){
        StockReport report = new StockReport();
        Data xmlData = report.getData();

        Data jsonData = new StockReportAdapter(report).getData();
    }
}
