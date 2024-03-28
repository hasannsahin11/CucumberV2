package JDBC.day02;

import Utilities.JDBCConnection;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_AbsoluteRelative extends JDBCConnection {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        rs.absolute(10);                                 // Goes to 10th row right away
        String title = rs.getString("title");
        System.out.println("Title of the 10th row: " + title);

        rs.absolute(15);                                // Goes to 15th row right away
        title = rs.getString("title");
        System.out.println("Title of the 15th row: " + title);

        rs.absolute(5);                                  // Goes to 5th row right away
        title = rs.getString("title");
        System.out.println("Title of the 5th row: " + title);

        rs.relative(20); // Moves 20 rows from current position! In this case it is 25th row
        title = rs.getString("title");
        System.out.println("Title of the 25th row: " + title);

        rs.relative(3); // Moves 3 rows from current position! In this case it is 28th row
        title = rs.getString("title");
        System.out.println("Title of the 28th row: " + title);

        rs.relative(-10); // Moves 10 rows back from current position! In this case it is 18th row
        title = rs.getString("title");
        System.out.println("Title of the 18th row: " + title);

        connection.close();

    }
}
