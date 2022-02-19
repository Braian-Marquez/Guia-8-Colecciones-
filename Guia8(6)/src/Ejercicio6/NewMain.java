package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap<String, Integer> productos = new HashMap();
        int opc, precio;
        boolean band;
        String nProducto;
        do {
            System.out.println("----MENU-----");
            System.out.println("1-Agregar producto");
            System.out.println("2-Modificar precio de un producto");
            System.out.println("3-Eliminar Producto");
            System.out.println("4-Mostrar Productos");
            System.out.println("5-Salir");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese nombre del producto");
                    nProducto = read.next();
                    System.out.println("Ingrese preceio del producto");
                    precio = read.nextInt();
                    productos.put(nProducto, precio);
                    break;
                case 2:
                    System.out.println("Ingrese nombre de producto a modificar precio");
                    nProducto = read.next();
                    band = false;
                    for (Map.Entry<String, Integer> entry : productos.entrySet()) {
                        if (entry.getKey().equals(nProducto)) {
                            System.out.println("Ingrese precio nuevo");
                            precio = read.nextInt();
                            entry.setValue(precio);
                            band = true;
                        }
                    }
                    if (!band) {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case 3:
                    band = false;
                    System.out.println("Ingrese producto a eliminar");
                    nProducto = read.next();
                    Iterator<Entry<String, Integer>> iterator = productos.entrySet().iterator();
                    while (iterator.hasNext()) {
                        Entry<String, Integer> entry = iterator.next();
                        if (entry.getKey().equals(nProducto)) {
                            iterator.remove();
                            band = true;
                        }
                    }
                    if (!band) {
                        System.out.println("Producto no encontrado");
                    } else {
                        System.out.println("Producto eliminado con exito!");
                    }
                    break;
                case 4:
                    System.out.println("--------------Mostrando productos----------");
                    for (Map.Entry<String, Integer> entry : productos.entrySet()) {
                        System.out.println("Producto: " + entry.getKey() + " Precio: " + entry.getValue());
                    }
                    break;
                default:
                    System.out.println("Ingrese opcion correcta");
            }
        } while (opc != 5);

    }
}
/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/