package Banking.Software;

import java.sql.*;

public class formNUmber {

    public String generateFormNo() {
        // Generates a random form number and saves it to the database
        String formNo = "F" + (int) (Math.random() * 100000);  // Generates a random number

        try {
            // Create a database connection
            DatabaseConnection con = new DatabaseConnection();
            String insertQuery = "INSERT INTO SignUp (form_no) VALUES (?)";
            PreparedStatement pstmt = con.connection.prepareStatement(insertQuery);
            pstmt.setString(1, formNo);
            pstmt.executeUpdate();
            pstmt.close();
            con.connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return formNo;
    }
}
