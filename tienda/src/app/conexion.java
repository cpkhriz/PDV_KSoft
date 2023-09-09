
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexion {
    
    public static Connection getConexion(){
        
        Connection conexion = null;
        
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiendaksoft?serverTimezone=UTC", "root", "090318MatheoyNoah!");
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        return conexion;
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
