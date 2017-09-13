package Lesson5;

public class Application {

    public static void main(String[] args) {
        DatabaseService databaseService = new OracleDatabaseService();
        databaseService.connect("path");
        databaseService.addRow();
        databaseService.deleteRow(1);
    }

}
