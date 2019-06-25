/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jural.barang;

/**
 *
 * @author ASUS
 */
import java.sql.*;
import javax.swing.*;

public class Database {

    private String dbuser = "root";
    private String dbpasswd = "";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(),
                    "JDBC Driver Error", JOptionPane.WARNING_MESSAGE);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_penjualan",dbuser, dbpasswd);
            stmt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),
                    "Connection Error",JOptionPane.WARNING_MESSAGE); 
        }        
    }
    public ResultSet getData(String SQString){
        try {
            rs = stmt.executeQuery(SQString);            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage()
                    ,"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;        
    }
    public void query(String SQLString){
        try {
            stmt.executeUpdate(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"error:"+e.getMessage(),
                    "Communication Error",JOptionPane.WARNING_MESSAGE); 
        }
    }
}
