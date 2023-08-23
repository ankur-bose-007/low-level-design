package main.designpatterns.adapter.correct;

public class StockReportAdapter implements Report{
    private StockReport stockReport;
    public StockReportAdapter(StockReport stockReport){
        this.stockReport = stockReport;
    }
    @Override
    public Data getData() {
        Data xmlData = convertXmlToJson(stockReport.getData());
        return xmlData;
    }

    private Data convertXmlToJson(Data xmlData){
        return new JsonData();
    }
}
