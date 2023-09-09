/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import app.categoria;
import app.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Khriiz
 */


public class metodos_funciones {
    
            conexion cn = new conexion();
            Connection con = conexion.getConexion();
            ResultSet rs;
            Statement st;
    public ArrayList<categoria>ObtenerCategoria(){
        ArrayList<categoria> lista_categoria = new ArrayList<>();
        
        try {
            
            String consulta="SELECT * FROM categoria";
            st = con.createStatement();
            rs=st.executeQuery(consulta);
            
            //Connection con = conexion.getConexion();
            //PreparedStatement ps;
            //ps = con.prepareStatement("SELECT idcategoria, nombre FROM categoria");

            //ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                categoria cate = new categoria();
                cate.setIdcategoria(rs.getInt("idcategoria"));
                cate.setNombre(rs.getString("nombre"));
                
                lista_categoria.add(cate);
            
            }
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "No se selecciono categoria");
        }
                
                return lista_categoria;
    }
    
}
