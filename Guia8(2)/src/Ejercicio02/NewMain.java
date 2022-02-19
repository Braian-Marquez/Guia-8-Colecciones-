package Ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList<>();
        String perro;
        String s = "";
        int opc;
        boolean bandera;
        boolean salir = false;
        System.out.println("************");
        do {

            bandera = false;
            System.out.println("---Menu---");
            System.out.println("1.Ingresar Raza de Perros");
            System.out.println("2.Mostrar Razas ingresadas");
            System.out.println("3.Eliminar Raza");
            System.out.println("4.Salir");
            opc = read.nextInt();
            System.out.println("************");
            switch (opc) {

                case 1:
                    System.out.println("Escribir la raza del perro");
                    perro = read.next();
                    razas.add(perro);
                    break;
                case 2:
                    System.out.println("Mostrando Razas ingresadas");
                    for (String aux : razas) {
                        System.out.println(aux);
                    }
                    break;
                case 3:
                    System.out.println("Ingresar el nombre de la raza que desea eliminar");
                    String razaEliminar = read.next();
                    Iterator<String> iterator = razas.iterator();

                    while (iterator.hasNext()) {
                        String auxiliar = iterator.next();
                        if (auxiliar.equals(razaEliminar)) {
                            iterator.remove();
                            bandera = true;
                        }
                    }
                    if (!bandera) {
                        System.out.println("La raza ingresada no se ha encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Si de verdad desea salir presione s/n");
                    s = read.next();
                    break;

          default:
              System.out.println("Error so boludo o q te pasa");
            }
            
        } while (!s.equalsIgnoreCase("S"));

    }
}
/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.*/
