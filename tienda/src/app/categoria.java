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

    
    private int id_categoria;
    private String nombre;
    


 public categoria(int idcategoria, String nombre) {
        this.id_categoria = idcategoria;
        this.nombre = nombre;
    }
 
 public int getIdcategoria() {
        return id_categoria;
    }

    public void setIdcategoria(int id_categoria) {
        this.id_categoria = id_categoria;
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
