import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import gymStore.Panier;

public class Main {
    public static void main(String[] args) {
        // Create a new User instance with sample data
        /* User newUser = new User(
            "john_doe",           // username
            "securePassword123",  // password
            "1234567890",         // phone number
            "john.doe@example.com", // email
            User.MembershipType.Premium // membership type
        );

        try {
            // Call the Register method to insert the user into the database
            newUser.Register();
        } catch (Exception e) {
            System.out.println("Error during user registration: " + e.getMessage());
            e.printStackTrace();
        } */
        
        // user/password
        /* String query = "SELECT * FROM Person WHERE username = ? AND password = ?";
        String username="john_ddoe";
        String password="securePassword123";

        try (Connection conn = DBconnection.getConnection()) {
            if (conn == null) {
                System.out.println("Failed to establish database connection!");
            }

            // Prepare the statement
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, username);
                stmt.setString(2, password);

                // Execute the query
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        System.out.println("Login successful!");
                        if(rs.getString("role").equals("Ad")) {
                            //INCLUDE ADMIN MENU
                        }else if(rs.getString("role").equals("Co")) {
                            //INCLUDE COACH MENU
                        }else {
                            //INCLUDE USER MENU
                        }
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } */
       Panier panier = new Panier();

    } 
}
