package Banking.Software;

import java.sql.*;

public class DatabaseConnection {

    Connection connection;
    Statement statement;
    public DatabaseConnection()
    {
        try
        {
            String Dburl = "jdbc:mysql://localhost:3306/BankDatabase";
            String username = "root";
            String password = "4710";
            connection = DriverManager.getConnection(Dburl,username,password);
            statement = connection.createStatement();

        }catch (Exception E)
        {
            E.printStackTrace();
        }
    }
    public static void main(String a [])
    {
        new DatabaseConnection();
    }
}
