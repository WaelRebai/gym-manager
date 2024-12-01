package Personnel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	// Replace 'gym_management' with your database name
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gym_management";
    // Default username for EasyPHP/MySQL
    private static final String USER = "root";
    // Default password (leave blank if none is set)
    private static final String PASSWORD = ""; 

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        	catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}
