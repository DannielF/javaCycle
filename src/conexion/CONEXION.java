package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CONEXION {
  
  public static void main(String[] args) {
    String dbURL = "jdbc:mysql://localhost:3306/libreria";
    String userName = "root";
    String password = "";

    try {
      Connection conn= DriverManager.getConnection(dbURL, userName, password);
      if (conn != null) {
        System.out.println("You are connected");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}