import java.sql.Connection;

public class TestConnection {
	
	    public static void main(String[] args) {
	        Connection connection = DBconnection.getConnection();
	        if (connection != null) {
	            System.out.println("Connected to the database successfully!");
	        } else {
	            System.out.println("Failed to connect to the database.");
	        }
	    }
	

}
