package src.gymPersonnel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/gym_manager";
    private static final String USER = "root"; // Default username for EasyPHP
    private static final String PASSWORD = ""; // Default password (empty for EasyPHP)
    private static final Logger logger = Logger.getLogger(DBconnection.class.getName());

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE, "MySQL JDBC Driver not found: " + e.getMessage(), e);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Database connection error: " + e.getMessage(), e);
        }
        return connection;
    }
}
