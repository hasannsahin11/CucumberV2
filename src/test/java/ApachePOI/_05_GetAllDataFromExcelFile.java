package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class _05_GetAllDataFromExcelFile {
    public static void main(String[] args) throws IOException {
        // This is just a reminder how to print elements of a 2D Array
//        String[][] zoo = {{"Lion", "4", "Africa"}, {"Tiger", "2"}, {"Elephant", "5", "Africa"}, {"Shark", "3"}};
//        for (int i = 0; i < zoo.length; i++) {
//            for (int j = 0; j < zoo[i].length; j++) {
//                System.out.println(zoo[i][j]);
//            }
//        }


        // This is how to get all the data from an Excel sheet
        String path = "src/test/java/ApachePOI/Resources/Zoo.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("zoo");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // getPhysicalNumberOfRows() works like .length in arrays
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {  // zoo[i].length
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
            System.out.println("+++++++++++++++++++");
        }


        // Same thing with 1 less line of code  // This is more professional
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { // getPhysicalNumberOfRows() works like .length in arrays
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {  // zoo[i].length
                Cell cell = sheet.getRow(i).getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
            System.out.println("+++++++++++++++++++");
        }
    }
}
