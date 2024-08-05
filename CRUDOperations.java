import java.sql.*;

public class CRUDOperations {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            stmt = conn.createStatement();

            // **CREATE Operation**
            String sqlCreate = "INSERT INTO your_table_name (column1, column2) VALUES ('value1', 'value2')";
            stmt.executeUpdate(sqlCreate);
            System.out.println("Record inserted successfully!");

            // **READ Operation**
            String sqlRead = "SELECT * FROM your_table_name";
            ResultSet rs = stmt.executeQuery(sqlRead);

            // Process the results set
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // ... retrieve other column values
                System.out.println("ID: " + id + ", Name: " + name);
            }
            rs.close();

            // **UPDATE Operation**
            String sqlUpdate = "UPDATE your_table_name SET column2='updated_value' WHERE id=1";
            stmt.executeUpdate(sqlUpdate);
            System.out.println("Record updated successfully!");

            // **DELETE Operation**
            String sqlDelete = "DELETE FROM your_table_name WHERE id=2";
            stmt.executeUpdate(sqlDelete);
            System.out.println("Record deleted successfully!");

            // Close resources
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Always close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
