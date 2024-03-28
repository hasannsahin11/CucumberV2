package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _04_GetAllDataInARow {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\Zoo.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheetAt(0);

        Row row = sheet.getRow(1);

        for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
            System.out.print(row.getCell(i)+ " ");
        }
        System.out.println();
    }
}
