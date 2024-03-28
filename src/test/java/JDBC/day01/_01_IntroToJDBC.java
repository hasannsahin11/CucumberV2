package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_IntroToJDBC {

    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // URL contains type of connection (jdbc), type of database (mysql), url of the remote server
        // port number on that server, name of the database we want to work on

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        Connection connection = DriverManager.getConnection(url, username, password);   // Create connection to database
        Statement statement = connection.createStatement();   // Created a statement to write our queries
        ResultSet rs = statement.executeQuery("select * from actor");  // Result is ready but not on our pc
        // The result is on the database
        rs.next();   // The arrow is on the first row

        String firstName = rs.getString("first_name");
        String lastName = rs.getString("last_name");
        System.out.println("1st row first and last name is: " + firstName+" "+ lastName);

        rs.next();   // Moved to the second row
        firstName = rs.getString(2);  // in DB index starts from 1
        lastName = rs.getString(3);
        System.out.println("2nd row first and last name is: " + firstName+" "+ lastName);
        connection.close();   // connection is closed!
    }
}
