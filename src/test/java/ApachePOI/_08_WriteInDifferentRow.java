package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInDifferentRow {
    public static void main(String[] args) {
        String path = "C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\Zoo.xlsx";
        Workbook workbook;
        Sheet sheet;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;

        try {
            fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet("Rows");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int rowCount = sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(rowCount);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello World!");

        for (int i = 1; i < 10; i++) {       // Creating 9 more new cells on the same row
            row.createCell(i).setCellValue(i);
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
