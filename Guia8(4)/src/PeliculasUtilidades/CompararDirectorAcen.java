
package PeliculasUtilidades;

import Ejercicio4.EntidadPelicula;
import java.util.Comparator;


public class CompararDirectorAcen implements Comparator<EntidadPelicula>{
    
    @Override
    public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t.getDirector().compareTo(t1.getDirector());
    }
}
