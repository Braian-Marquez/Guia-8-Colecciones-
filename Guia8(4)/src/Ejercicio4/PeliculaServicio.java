package Ejercicio4;

import PeliculasUtilidades.CompararDirectorAcen;
import PeliculasUtilidades.CompararDuracionAcen;
import PeliculasUtilidades.CompararDuracionDesc;
import PeliculasUtilidades.CompararTituloAscen;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class PeliculaServicio {

    ArrayList<EntidadPelicula> listaPelicula;
    Scanner read;

    public PeliculaServicio() {
        read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        listaPelicula = new ArrayList<>();
    }

    public void bucle() {
        String opc;
        do {
            ingresarDatosPelicula();
            System.out.println("Desea ingresar otra pelicula? (S/N)");
            opc = read.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("ERROR ingrese opcion valida (S/N)");
                opc = read.next();
            }
        } while (!opc.equalsIgnoreCase("N"));
    }

    public void ingresarDatosPelicula() {
        System.out.println("Ingresar el titulo de la pelicula");
        System.out.println("ingrese titulo de la pelicula");
        String titulo = read.next();
        System.out.println("ingrese director de la pelicula");
        String director = read.next();
        System.out.println("Ingrese duracion de la pelicula en formato horas:minutos");
        System.out.println("Ingrese horas");
        int horas = read.nextInt();
        System.out.println("Ingrese minutos");
        int minutos = read.nextInt();
        LocalTime duracion = LocalTime.of(horas, minutos);
        crearPelicula(titulo, director, duracion);

    }

    public void crearPelicula(String titulo, String director, LocalTime duracion) {
        EntidadPelicula pelicula = new EntidadPelicula(titulo, director, duracion);
        addPelicula(pelicula);
    }

    public void addPelicula(EntidadPelicula pelicula) {
        listaPelicula.add(pelicula);

    }

    public void mostrarPeliculas() {
        for (EntidadPelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
        }
    }

    public void pelisMayoresDeUnaHora() {
        LocalTime comp = LocalTime.of(1, 00);
        for (EntidadPelicula pelicula : listaPelicula) {
            if (pelicula.getDuracion().isAfter(comp)) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenamiento() {

        ordenarDuracionDescendente();
        ordenarDuracionAscendente();
        ordenarTituloAscendente();
        ordenarDirectorAscendente();

    }

    public void ordenarDuracionAscendente() {
        System.out.println("Peliculas ordenadas por duracion de manera ascendente");
        Collections.sort(listaPelicula, new CompararDuracionAcen());
        mostrarPeliculas();

    }

    public void ordenarDuracionDescendente() {
        System.out.println("Peliculas ordenadas por duracion de manera descendente");
        Collections.sort(listaPelicula, new CompararDuracionDesc());
        mostrarPeliculas();
    }

    public void ordenarTituloAscendente() {
        System.out.println("Peliculas ordenadas por titulo de manera ascendente");
        Collections.sort(listaPelicula, new CompararTituloAscen());
        mostrarPeliculas();

    }

    public void ordenarDirectorAscendente() {
        System.out.println("Peliculas ordenadas por director de manera ascendente");
        Collections.sort(listaPelicula, new CompararDirectorAcen());
        mostrarPeliculas();
    }
}
/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
19
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
