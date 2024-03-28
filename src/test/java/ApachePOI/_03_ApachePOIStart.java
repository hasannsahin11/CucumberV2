package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        // path of the file
        String path = "src/test/java/ApachePOI/Resources/Zoo.xlsx";

        // Creating the connection here to read the data
        FileInputStream fileInputStream = new FileInputStream(path);

        // Getting the workbook(excel) file with the connection
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // Getting the sheet that you want to work on by its name.
        Sheet sheet = workbook.getSheet("zoo");

        // We got the row we want
        Row row = sheet.getRow(0);

        // Getting the specific cell
        Cell cell = row.getCell(0);

        // Another cell
        Cell cell1 = row.getCell(1);

        System.out.println(cell);
        System.out.println(cell1);

        Row row1 = sheet.getRow(1);
        Cell cell2 = row1.getCell(2);
        System.out.println(cell2);

    }
}
