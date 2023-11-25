package main.designprinciples.dependencyinversion.wrong;


// The problem with this approach is that the high level
// class BudgetReport is tightly coupled to the low level
// class MySQLDatabase which makes it difficult for future
// changes. Let's say in future if budget report class wants
// to switch the database changes need to be done in the
// BudgetReport class. This violates the dependency inversion
// principle which says that high level classes should not
// depend on low level classes rather both should depend on
// abstraction.
public class BudgetReport {
    private final MySQLDatabase db;

    BudgetReport(MySQLDatabase db){
        this.db = db;
    }

    public String find(String date){
        return db.find(date);
    }

    public void save(String data){
        db.insert(data);
    }
}
