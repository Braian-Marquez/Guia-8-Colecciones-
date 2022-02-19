
package PeliculasUtilidades;

import Ejercicio4.EntidadPelicula;
import java.util.Comparator;


public class CompararTituloAscen  implements Comparator<EntidadPelicula>{

    @Override
    public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t.getTitulo().compareTo(t1.getTitulo());
    }
    
}
