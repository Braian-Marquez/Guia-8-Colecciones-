package Ejercicio3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoServicio {

    ArrayList<Alumno> alumnos;
    Scanner read;

    public AlumnoServicio() {
        this.alumnos = new ArrayList<>();
       read= new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    }

    public void pedirInformacion() {
        ArrayList<Integer> n = new ArrayList<>();
        String name = "";
        String opc="";
        int nota;
        do {

            System.out.println("Ingrese el nombre del alumno");
            name = read.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresar NOTA del alumno");
                nota = read.nextInt();
                n.add(nota);

            }
            crearAlumno(name, n);
            System.out.println("Desea agregar otro alumno? (S/N)");
            opc = read.next();
            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N")) {
                System.out.println("Error¡ ingrese la opcion correcta");
                opc = read.next();
            }
        } while (!opc.equalsIgnoreCase("N"));

    }

    public void crearAlumno(String nombre, ArrayList<Integer> notas) {
        Alumno alumno = new Alumno();

        alumno.setNombre(nombre);
        alumno.setNotas(notas);

        agregarAlumno(alumno);
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    public void ingresarNombreABuscar() {
        System.out.println("Ingrese el nombre del alumno que desea buscar");
        String name = read.next();
        Alumno buscar = buscarAlumno(name);
        if (buscar != null) {
            System.out.println("El promedio es " + obtenerPromedio(buscar));
        } else {
            System.out.println("El alumno no se ha encontrado");
        }

    }

    public Alumno buscarAlumno(String nombre) {
        Alumno buscar = null;
        for (Alumno alumno : alumnos) {
            buscar = alumno;
            break;
        }
        return buscar;
    }

    public double obtenerPromedio(Alumno alumno) {
        int acu = 0;
        for (Integer nota : alumno.getNotas()) {
            acu += nota;
        }
        return (double) acu / alumno.getNotas().size();
    }
}
