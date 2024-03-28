package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _03_GetAllRowColumn extends JDBCConnection {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); //Stores the names, types, and number of columns
        System.out.println(rsmd);

        int columnCount = rsmd.getColumnCount();   //Gives the number of columns
        System.out.println(columnCount);

        for (int i = 1; i <= columnCount; i++) {
            String columnName = rsmd.getColumnName(i);   // gives column name
            System.out.println(columnName);

            String columnType = rsmd.getColumnTypeName(i);  // gives column type name
            System.out.println(columnType);
        }
    }

    @Test
    public void test2() throws SQLException {

        // Print all rows on the language table as they are shown in the mysql result
        ResultSet rs = statement.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            System.out.print(rsmd.getColumnName(i)+ "\t\t");
        }
        System.out.println();

        String languageId;
        String name;
        String lastUpdate;

        rs.last();
        int rowCount = rs.getRow();
        rs.first();
        for (int i = 1; i <= rowCount; i++) {
            languageId = rs.getString("language_id");
            name = rs.getString("name");
            lastUpdate = rs.getString("last_update");
            System.out.println(languageId + "\t\t\t\t" + name + "\t\t\t\t" + lastUpdate);
            rs.next();
        }
    }
}
