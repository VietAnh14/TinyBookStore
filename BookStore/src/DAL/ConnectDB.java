/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Viet Anh
 */
public class ConnectDB {
    private static String username = "sa";
    private static String password = "datchim147";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=yourDBname;";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   public static Connection getConnection(){
       try {
           Class.forName(driver);
           Connection cn = DriverManager.getConnection(url, username, password);
           return cn;
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
           return null;
       }
   }
   
   public static void closeCn(Connection cn, PreparedStatement ps, ResultSet rs){
       try {
           if (rs != null && !rs.isClosed()) {
               rs.close();
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       try {
           if (ps != null && !ps.isClosed()) {
               ps.close();
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       try {
           if (cn != null && !cn.isClosed()) {
               cn.close();
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}