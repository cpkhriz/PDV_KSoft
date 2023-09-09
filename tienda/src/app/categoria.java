/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Khriiz
 */
public class categoria {

    public categoria() {
    }

    
    private int idcategoria;
    private String nombre;
    


 public categoria(int idcategoria, String nombre) {
        this.idcategoria = idcategoria;
        this.nombre = nombre;
    }
 
 public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
