package Lesson5;

public interface DatabaseService {

    void connect(String path);

    void addRow();

    void deleteRow(int rowId);

}
