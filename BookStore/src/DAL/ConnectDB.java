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
import java.sql.DatabaseMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Viet Anh
 */
public class ConnectDB {
    private static String username = "sa";
    private static String password = "datchim147";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNS;";
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    protected Connection cn;
   public void getConnection(){
       try {
           Class.forName(driver);
            cn = DriverManager.getConnection(url, username, password);
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
       }
   }
   
   public  void closeCn(Connection cn, PreparedStatement ps, ResultSet rs){
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
   
   public void getClose(){
        try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}

