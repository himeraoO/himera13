package Lesson5;

public class OracleDatabaseService extends AbstractDatabaseService
        implements DatabaseService {

    @Override
    public void addRow() {
        System.out.println("Add row to Oracle DB");
    }

    @Override
    public void deleteRow(int rowId) {
        System.out.println("Delete row " + rowId + " from Oracle DB");
    }

}
