package Ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<String> paises = new HashSet();
        ArrayList<String> lista;
        int opcion;
        String pais, borrar;
        do {
            System.out.println("----menu----");
            System.out.println("1-Ingrese pais");
            System.out.println("2-Mostrar paises");
            System.out.println("3-Eliminar un pais");
            System.out.println("4-Salir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese pais a la lista");
                    pais = read.next();
                    paises.add(pais);
                    break;
                case 2:
                    System.out.println("Mostrando paises");
                    for (String p : paises) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ingresar pais a eliminar");
                    borrar = read.next();
                    boolean band = false;
                    Iterator<String> iterator = paises.iterator();
                    while (iterator.hasNext()) {
                        if (iterator.next().equals(borrar)) {
                            iterator.remove();
                            band = true;
                        }
                    }
                    if (band) {
                        System.out.println("Pais eliminado");
                    } else {
                        System.out.println("Pais no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo......");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 4);
        System.out.println("Paises ordenados alfabeticamente");
        lista = new ArrayList(paises);
        Collections.sort(lista);
        for (String p : lista) {
            System.out.println(p);
        }
    }

}
/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.*/
