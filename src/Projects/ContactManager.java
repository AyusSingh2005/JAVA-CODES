package Projects;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ContactManager {
    private static Connection conn = DBConnection.getConnection();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Contact Manager ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> UserAuth.registerUser();
                case 2 -> {
                    int userId = UserAuth.loginUser();
                    if (userId != -1) manageContacts(userId);
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void manageContacts(int userId) {
        while (true) {
            System.out.println("\n=== Contacts Menu ===");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addContact(userId);
                case 2 -> viewContacts(userId);
                case 3 -> deleteContact(userId);
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addContact(int userId) {
        try {
            System.out.print("Enter contact name: ");
            String name = sc.nextLine();
            System.out.print("Enter mobile number: ");
            String phone = sc.nextLine();

            String query = "INSERT INTO contacts (user_id, name, phone) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            stmt.setString(2, name);
            stmt.setString(3, phone);
            stmt.executeUpdate();

            System.out.println("✅ Contact added!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewContacts(int userId) {
        try {
            String query = "SELECT id, name, phone FROM contacts WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Your Contacts ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Phone: " + rs.getString("phone"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deleteContact(int userId) {
        try {
            System.out.print("Enter Contact ID to delete: ");
            int contactId = Integer.parseInt(sc.nextLine());

            String query = "DELETE FROM contacts WHERE id = ? AND user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, contactId);
            stmt.setInt(2, userId);
            int rows = stmt.executeUpdate();

            if (rows > 0) System.out.println("✅ Contact deleted!");
            else System.out.println("❌ Contact not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
