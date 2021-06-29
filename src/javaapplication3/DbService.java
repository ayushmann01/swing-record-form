package javaapplication3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbService {
  static Connection con;
    static {
         String url = "jdbc:mysql://localhost:3306/iimt";
         String uname = "root";
         String pass = "newjava@123";
      try {
          Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
      }
      try {        
          con=DriverManager.getConnection(url,uname,pass);
      } catch (SQLException ex) {
          Logger.getLogger(DbService.class.getName()).log(Level.SEVERE, null, ex);
      }
      if(con==null) 
       System.out.println("Connection fail");
    }
  public static Connection getConnection()
  {
    return con;
  }
}    

 