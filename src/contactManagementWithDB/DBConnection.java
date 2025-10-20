package contactManagementWithDB;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ContactManager";
    private static final String USER = "root";
    private static final String PASSWORD = "******"; ////ACTUAL PASSWORD HERE
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(Exception e){
            System.out.println("Database connection failed: " + e.getMessage());
            return null;
        }
    }
    public static void main(String[]args){
        Connection conn = getConnection();
        if(conn != null){
            System.out.println("✅ Connected to MySQL successfully!");
        }
    }
}