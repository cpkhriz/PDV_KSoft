
package app;

import app.categoria;
import java.util.ArrayList;


public class listado_categorias {
    ArrayList<categoria>lista;

    public listado_categorias() {
        lista = new ArrayList();
    }
    
    public void agregar_categoria(categoria c){
        lista.add(c);
    }
    
    
}
