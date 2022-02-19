
package PeliculasUtilidades;

import Ejercicio4.EntidadPelicula;
import java.util.Comparator;

public class CompararDuracionDesc implements Comparator<EntidadPelicula>{

    @Override
    public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t1.getDuracion().compareTo(t.getDuracion());
    }
}
