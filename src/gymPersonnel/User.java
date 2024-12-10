package src.gymPersonnel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class User extends Person {

    // MembershipType enum can be private if it's only used in the User class
    public enum MembershipType { Basic, Pro, Premium }

	private  MembershipType membership;

    // Constructor
    public User(String username, String password, String phoneNb, String email, MembershipType membership) {
        super(username, password, phoneNb, email);
        this.membership = membership;
    }

    public void Register() {
        // SQL Queries
        String insertPersonQuery = "INSERT INTO Person (username, password, phoneNb, email, role) VALUES (?, ?, ?, ?, ?)";
        String insertUserQuery = "INSERT INTO User (membershipType) VALUES (LAST_INSERT_ID(), ?)";

        Connection conn = null;  // Declare connection outside of try-with-resources

        try {
            conn = DBconnection.getConnection();  // Get connection using DBconnection
            if (conn == null) {
                System.out.println("Failed to establish database connection!");
                return;
            }

            // Start transaction
            conn.setAutoCommit(false);

            // Insert into Person table
            try (PreparedStatement personStmt = conn.prepareStatement(insertPersonQuery)) {
                personStmt.setString(1, this.getUsername());
                personStmt.setString(2, this.getPassword());
                personStmt.setString(3, this.getPhoneNb());
                personStmt.setString(4, this.getEmail());
                personStmt.setString(5, "Us");  // Role is 'User'
                personStmt.executeUpdate();
            }

            // Insert into User table
            try (PreparedStatement userStmt = conn.prepareStatement(insertUserQuery)) {
                userStmt.setString(1, this.membership.toString());
                userStmt.executeUpdate();
            }

            // Commit transaction
            conn.commit();
            System.out.println("User registered successfully!");

        } catch (SQLException e) {
            System.out.println("Error registering user. Rolling back transaction...");
            try {
                if (conn != null) {
                    conn.rollback();  // Ensure the transaction is rolled back in case of an error
                }
            } catch (SQLException rollbackEx) {
                System.out.println("Error during rollback: " + rollbackEx.getMessage());
            }
            e.printStackTrace();
        } finally {
            // Close connection if it's not null
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Getters and Setters
    public MembershipType getMembership() {
        return membership;
    }

    public void setMembership(MembershipType newMembership) {
        this.membership = newMembership;
    }
}
