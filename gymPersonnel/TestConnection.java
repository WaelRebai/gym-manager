import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        Connection connection = DBconnection.getConnection();
        
        if (connection != null) {
            System.out.println("Database connection successful!");
            try {
                connection.close();  // Close the connection after testing
            } catch (Exception e) {
                System.out.println("Error while closing the connection: " + e.getMessage());
            }
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}
