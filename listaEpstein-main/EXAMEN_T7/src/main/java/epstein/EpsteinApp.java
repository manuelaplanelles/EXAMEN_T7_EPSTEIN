package epstein;

import java.util.*;

public class EpsteinApp {
    static Collection<Famoso> listaEpstein = new ArrayList<>();
    static Scanner teclado =new Scanner(System.in);

    public static void main(String[] args) {
        procesarDatos();
        nuevoFamoso();
        buscarFamoso();
        eliminarMenores();
       // generarEstadisticas(Collection<Famoso> listaEpstein);

    }
    public static void procesarDatos(){
        System.out.println("Procesando datos desde EntradaDatos...");
        EntradaDatos.generarDatos();
        Queue<Famoso> cola = EntradaDatos.getDatosActuales();

        while (!cola.isEmpty()){
            Famoso famoso =cola.poll();
            listaEpstein.add(famoso);
            System.out.println("-- Grabando " + famoso);
        }
        System.out.println("Procesado de datos finalizado.");
    }
    public static void nuevoFamoso(){
        System.out.println("Insertar famoso...");
        System.out.println("Nombre: ");
        String nombre= teclado.nextLine();
        System.out.println("Pais: ");
        String pais= teclado.nextLine();
        System.out.println("Profesión: ");
        String profesion= teclado.nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();

        listaEpstein.add(new Famoso(nombre, pais,profesion,edad));
        System.out.println("Famoso insertado.");
    }
    public static void buscarFamoso(){
        System.out.println("Buscando famoso...");
        System.out.println("Nombre: ");
        String nombre= teclado.nextLine();
        System.out.println("Pais: ");
        String pais= teclado.nextLine();
        System.out.println("Profesión: ");
        String profesion= teclado.nextLine();
        System.out.println("Edad: ");
        int edad = teclado.nextInt();
        Famoso buscar =new Famoso(nombre,pais,profesion,edad);

        if(listaEpstein.contains((buscar))){
            System.out.println("El famoso HA ACUDIDIO a la Isla...");
        }else{
            System.out.println("El famoso no esta en la lista Epstein. No ha acudido a la Isla...");
        }
    }
    public static void eliminarMenores(){
        System.out.println("Eliminando menores de edad...");
        Iterator<Famoso> it = listaEpstein.iterator();
        while (it.hasNext()){
            Famoso famoso=it.next();
            if (famoso.getEdad()<18){
                System.out.println("-- "+famoso.getNombre()+" fulminado.");
                it.remove();
            }
        }

    }
    public static Estadisticas generarEstadisticas(Collection<Famoso> listaEpstein){
        System.out.println("Generando estadisticas...");
        System.out.println("Estadisticas generadas: ");
        return null;

    }
}
