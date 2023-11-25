package main.designprinciples.dependencyinversion.correct;

// With this approach the hard dependency of BudgetReport
// class on the Database class goes away. In future if
// a new Database is introduced no change will be required
// in the BudgetReport class.
public class BudgetReport {
    private final Database db;

    BudgetReport(Database db){
        this.db = db;
    }

    public String find(String date){
        return db.find(date);
    }

    public void save(String data){
        db.insert(data);
    }
}
