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
            System.out.println("\n==============================");
            System.out.println("   WELCOME TO CONTACT MANAGER");
            System.out.println("==============================");
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
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }

    // Menu for logged-in users
    private static void manageContacts(int userId) {
        while (true) {
            System.out.println("\n------------------------------");
            System.out.println("       CONTACTS MENU");
            System.out.println("------------------------------");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Search Contacts");
            System.out.println("5. Delete Contact");
            System.out.println("6. Logout");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addContact(userId);
                case 2 -> viewContacts(userId);
                case 3 -> updateContact(userId);
                case 4 -> searchContacts(userId);
                case 5 -> deleteContact(userId);
                case 6 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("❌ Invalid choice!");
            }
        }
    }

    // Add a new contact
    private static void addContact(int userId) {
        try {
            System.out.print("Enter contact name: ");
            String name = sc.nextLine().trim();
            System.out.print("Enter mobile number (10-15 digits): ");
            String phone = sc.nextLine().trim();

            if (name.isEmpty() || !phone.matches("\\d{10,15}")) {
                System.out.println("❌ Invalid input!");
                return;
            }

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

    // View all contacts
    private static void viewContacts(int userId) {
        try {
            String query = "SELECT id, name, phone FROM contacts WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Your Contacts ---");
            int count = 0;
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Phone: " + rs.getString("phone"));
                count++;
            }
            if(count == 0) System.out.println("No contacts found!");
            else System.out.println("Total contacts: " + count);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Update a contact
    private static void updateContact(int userId) {
        try {
            System.out.print("Enter Contact ID to update: ");
            int contactId = Integer.parseInt(sc.nextLine());

            System.out.print("Enter new name: ");
            String name = sc.nextLine().trim();
            System.out.print("Enter new phone number (10-15 digits): ");
            String phone = sc.nextLine().trim();

            if (name.isEmpty() || !phone.matches("\\d{10,15}")) {
                System.out.println("❌ Invalid input!");
                return;
            }

            String query = "UPDATE contacts SET name = ?, phone = ? WHERE id = ? AND user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setInt(3, contactId);
            stmt.setInt(4, userId);
            int rows = stmt.executeUpdate();

            if (rows > 0) System.out.println("✅ Contact updated!");
            else System.out.println("❌ Contact not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Search contacts by name
    private static void searchContacts(int userId) {
        try {
            System.out.print("Enter name to search: ");
            String searchName = sc.nextLine().trim();

            String query = "SELECT id, name, phone FROM contacts WHERE user_id = ? AND name LIKE ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, userId);
            stmt.setString(2, "%" + searchName + "%");
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- Search Results ---");
            int count = 0;
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Phone: " + rs.getString("phone"));
                count++;
            }
            if(count == 0) System.out.println("No contacts found!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Delete a contact
    private static void deleteContact(int userId) {
        try {
            System.out.print("Enter Contact ID to delete: ");
            int contactId = Integer.parseInt(sc.nextLine());

            System.out.print("Are you sure you want to delete? (y/n): ");
            String confirm = sc.nextLine().trim().toLowerCase();
            if (!confirm.equals("y")) {
                System.out.println("Deletion cancelled.");
                return;
            }

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
