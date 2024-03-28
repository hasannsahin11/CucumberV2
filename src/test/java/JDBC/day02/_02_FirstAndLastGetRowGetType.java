package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_FirstAndLastGetRowGetType extends JDBCConnection {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");
        rs.last();   // It jumps to the last row
        String cityName = rs.getString("city");
        System.out.println("Name of the city in the last row: " + cityName);

        // If a column contains pure numbers we can get them either as a String or as an Int
        int idInt =  rs.getInt("city_id");
        System.out.println("ID Int: " + idInt);

        String idStr = rs.getString("city_id");
        System.out.println("ID String: " + idStr);

        // YOu can find how many rows your query by using last and getRow one after another
        int currentRowNumber = rs.getRow();
        System.out.println("Current row number: "+ currentRowNumber);

        rs.first();  // Jumps back to the first row
        cityName = rs.getString("city");
        System.out.println("City in the first row: "+ cityName);

         currentRowNumber = rs.getRow();
        System.out.println("Current row number: "+ currentRowNumber);

    }
}
