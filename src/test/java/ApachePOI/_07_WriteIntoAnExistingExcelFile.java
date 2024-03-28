package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteIntoAnExistingExcelFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\Zoo.xlsx";
        FileInputStream fileInputStream;
        Workbook workbook;
        Sheet sheet;
        FileOutputStream fileOutputStream;

        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet("login");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // We made changes in the memory and these new data are not in the file yet
        Row row = sheet.createRow(6);    // Created a new row
        Cell cell = row.createCell(0);   // Created a new cell
        cell.setCellValue("Hello World!");  // entered a value in the cell

        for (int i = 1; i < 10; i++) {       // Creating 9 more new cells on the same row
            row.createCell(i).setCellValue(i+1);
        }


        try {
            fileInputStream.close();                           // We closed the read only connection (incoming connection)
            fileOutputStream = new FileOutputStream(path);     // Created new connection for writing (outgoing connection)
            workbook.write(fileOutputStream);                  // We write our data into the file now
            workbook.close();                                  // When it's done closed the workbook connection
            fileOutputStream.close();                          // Closed the entire outgoing connection
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
