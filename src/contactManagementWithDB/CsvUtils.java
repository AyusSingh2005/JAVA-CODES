package contactManagementWithDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CsvUtils {

    // Export ResultSet to CSV
    public static void exportToCsv(ResultSet rs, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("ID,Name,Phone");
            bw.newLine();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                bw.write(id + "," + name + "," + phone);
                bw.newLine();
            }

            System.out.println("✅ Contacts exported to " + filePath);
        } catch (Exception e) {
            System.out.println("Error exporting CSV: " + e.getMessage());
        }
    }

    // Import CSV into contacts
    public static void importFromCsv(Connection conn, int userId, String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
                if (firstLine) { // Skip header
                    firstLine = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 2) continue; // skip invalid rows

                String name = data[0].trim();
                String phone = data[1].trim();

                if (name.isEmpty() || !phone.matches("\\d{10,15}")) continue;

                String query = "INSERT INTO contacts (user_id, name, phone) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setInt(1, userId);
                stmt.setString(2, name);
                stmt.setString(3, phone);
                stmt.executeUpdate();
            }
            System.out.println("✅ Contacts imported from " + filePath);
        } catch (Exception e) {
            System.out.println("Error importing CSV: " + e.getMessage());
        }
    }
}
