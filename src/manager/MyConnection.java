/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

/**
 *
 * @author Vinhneee
 */
import java.sql.*;
import javax.swing.*;
public class MyConnection {
    public Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String URL ="jdbc:sqlserver://localhost:1433;Database=Video;user=khoi;password=123;encrypt=true;trustServerCertificate=true;";
            Connection con =DriverManager.getConnection(URL);
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(),"Loi",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}

