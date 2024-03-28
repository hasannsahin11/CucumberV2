package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class _09_WriteInNewExcelFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\WriteIntoANewExcelFile.xlsx"; // Added a new path here with the name that we want to create our Excel

        XSSFWorkbook workBook = new XSSFWorkbook(); // Created a new excel file in the memory
        XSSFSheet sheet = workBook.createSheet("ExcelTest"); // Created a new sheet in the memory

        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("Hello World");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workBook.write(fileOutputStream);
        workBook.close();
        fileOutputStream.close();
    }
}
