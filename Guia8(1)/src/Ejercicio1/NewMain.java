package Ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        ArrayList<String> razas = new ArrayList<>();
        int opc;
        String salir = "";
        String raza;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Ingresar raza de un perro");
            System.out.println("2. Mostrar razas ingresadas");
            System.out.println("3. Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa la raza que desea agregar a la lista");
                    raza = read.next();
                    razas.add(raza);

                    break;
                case 2:
                    for (String raza1 : razas) {
                        System.out.println(raza1);
                    }
                    break;
                case 3:
                    System.out.println("Esta seguro que desea salir? (S/N)");
                    salir = read.next();
            }
        } while (!salir.equalsIgnoreCase("S"));

    }

}
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.*/
