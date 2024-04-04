package dbConnetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/athang";
        String userName = "root";
        String password = "root";

        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, password);
            if (conn != null) {
                System.out.println("The connection is successful0");
            }else{
                System.out.println("Could not connect to db");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
