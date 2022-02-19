
package PeliculasUtilidades;

import Ejercicio4.EntidadPelicula;
import java.util.Comparator;


public class CompararDuracionAcen implements Comparator<EntidadPelicula>{

    @Override
    public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t.getDuracion().compareTo(t1.getDuracion());
    }
}
