package contactManagementWithDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UserAuth {
    private static Connection conn = DBConnection.getConnection();
    private static Scanner sc = new Scanner(System.in);

    // Register a new user with password hashing
    public static void registerUser() {
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine().trim();
            System.out.print("Enter password (min 6 chars): ");
            String password = sc.nextLine();

            // Input validation
            if(username.isEmpty() || password.length() < 6){
                System.out.println("❌ Invalid username or password!");
                return;
            }

            // Check if username exists
            String checkQuery = "SELECT * FROM users WHERE username = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();

            if(rs.next()){
                System.out.println("❌ Username already exists! Try another.");
                return;
            }

            // Hash password
            String hashedPassword = Utils.hashPassword(password);

            // Insert new user
            String insertQuery = "INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertQuery);
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            stmt.executeUpdate();

            System.out.println("✅ Registration successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Login user with password hashing
    public static int loginUser() {
        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine().trim();
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if(username.isEmpty() || password.isEmpty()){
                System.out.println("❌ Invalid input!");
                return -1;
            }

            // Hash input password
            String hashedPassword = Utils.hashPassword(password);

            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                System.out.println("✅ Login successful! Welcome, " + username);
                return rs.getInt("id"); // return user ID
            } else {
                System.out.println("❌ Invalid credentials!");
                return -1;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}
