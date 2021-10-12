import java.io.*;
import java.util.*;

class AddressBook{

    public static void main(String[] args) {

        String nombre;
        String telefono;
        HashMap<String, String> agenda = new HashMap();
        Scanner ingresar = new Scanner(System.in);
        int eleccion = 0;

        System.out.println("         *****                                 ***          ");
        System.out.println("        ******                                 ***          ");
        System.out.println("       *******                                 ***          ");
        System.out.println("      **** ***  ******   ******  *******   *******  ******  ");
        System.out.println("     ****  *** ******** ***  *** *** **** **** ***     **** ");
        System.out.println("    ****   *** ***  *** ******** ***  *** ***  *** ******** ");
        System.out.println("   *********** **** *** ****     ***  *** **** *** ***  *** ");
        System.out.println("  ****     ***  *******  ******  ***  ***  ******* ******** ");
        System.out.println("                    ***                                     ");
        System.out.println("               *** ****                                     ");
        System.out.println("                ******                                      ");



        while(eleccion != 6){

            System.out.println("                         Ingrese la opción deseada:         ");
            System.out.println("1. Agregar contactos.");
            System.out.println("2. Eliminar contactos.");
            System.out.println("3. Mostrar contactos.");
            System.out.println("4. Guardar CSV.");
            System.out.println("5. Cargar CSV.");
            System.out.println("6. Terminar.");

            System.out.print("Ingresa una opción: ");
            eleccion = ingresar.nextInt();


            switch(eleccion){
                case 1:
                    nombre = null;
                    telefono = null;

                    create(nombre, telefono, agenda);

                    break;

                case 2:
                    nombre = null;
                    delete(nombre, agenda);
                    break;

                case 3:
                    System.out.println("Lista de contactos.");
                    list(agenda);
                    break;

                case 4:
                    System.out.println("Exportar CSV.");


                case 5:
                    System.out.println("Recuperar agenda de un CSV.");
                    break;

                case 6:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    static void create(String nombre, String telefono, HashMap<String, String> agenda) {
        Scanner ingresar = new Scanner(System.in);
        System.out.print("Ingresa el nombre del contacto: " );
        nombre = ingresar.nextLine();
        System.out.println();

        System.out.print("Ingresa el teléfono del contacto: " );
        telefono = ingresar.nextLine();
        agenda.put(nombre, telefono);
        System.out.println();
    }

     static void delete(String nombre, HashMap<String, String> agenda){
        Scanner ingresar = new Scanner(System.in);
        System.out.print("Nombre del contacto a eliminar: ");
        nombre = ingresar.nextLine();
        agenda.remove(nombre);
        System.out.println();
    }


     static void list(HashMap<String, String> agenda){
        System.out.println(agenda);
        }
}
