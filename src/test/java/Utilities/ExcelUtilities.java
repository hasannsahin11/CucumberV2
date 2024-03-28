package Utilities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ExcelUtilities {

    public static ArrayList<ArrayList<String>> getDataFromExcel(String path, String sheetName, int columnCount) {
        Sheet sheet;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<ArrayList<String>> returnList = new ArrayList<>();
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                Cell cell = sheet.getRow(i).getCell(j);
                innerList.add(cell.toString());
            }
            returnList.add(innerList);
        }
        return returnList;
    }

    public static void writeInExcel(String path, Scenario scenario, String startTime, String endTime, Duration duration) {
        File file = new File(path);
        if (!file.exists()) {   // If file doesn't exist
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Campus Test Results");
            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime);
            cell = row.createCell(4);
            cell.setCellValue(endTime);
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());


            try {
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                workbook.write(fileOutputStream);
                workbook.close();
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        } else {
            FileInputStream fileInputStream;
            Workbook workbook;
            Sheet sheet;
            try {
                fileInputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(fileInputStream);
                sheet = workbook.getSheet("Campus Test Results");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            Row row = sheet.createRow(rowCount);
            Cell cell = row.createCell(0);
            cell.setCellValue(scenario.getId());
            cell = row.createCell(1);
            cell.setCellValue(scenario.getName());
            cell = row.createCell(2);
            cell.setCellValue(scenario.getStatus().toString());
            cell = row.createCell(3);
            cell.setCellValue(startTime);
            cell = row.createCell(4);
            cell.setCellValue(endTime);
            cell = row.createCell(5);
            cell.setCellValue(duration.toString());

            FileOutputStream fileOutputStream;
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
}

//    public static void main(String[] args) {
//        ArrayList<ArrayList<String>> data = getDataFromExcel("C:\\Users\\hasan\\IdeaProjects\\Cucumber\\src\\test\\java\\ApachePOI\\Resources\\Zoo.xlsx", "Rows", 10);
//        System.out.println(data);
//    }


