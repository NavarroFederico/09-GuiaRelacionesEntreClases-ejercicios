/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01.relacionesentreclases;

import ejercicio01.relacionesentreclases.entidades.Perro;
import ejercicio01.relacionesentreclases.entidades.Persona;
import ejercicio01.relacionesentreclases.entidades.enumeraciones.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio01RelacionesEntreClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Perro p1 = new Perro("Mozito", Raza.CALLEJERO, 10, 2);
        Perro p2 = new Perro("Panchita", Raza.BORDER_COLLIE, 1, 3);

        ArrayList<Perro> listaPerros = new ArrayList();
        listaPerros.add(p1);
        listaPerros.add(p2);

        ArrayList<Persona> listaDePersonas = new ArrayList();

        // Creamos dos personas y dos perros 
        //
        System.out.println("Sistema de adopción de Perros");
        System.out.println("Para Adoptar un perro los pasos a seguir son:"
                + "\n1- Se debe registrar en el sistema."
                + "\n2- debe elegir de la lista de perros disponibles el que desee");
        int opcion;
        do {

            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearUnaCuentaYAdoptarUnPerro(listaDePersonas, listaPerros, leer);
                    break;
                case 2:

                    break;
                case 3:
                    mostrarPerrosEnAdopcion(listaPerros);
                    break;
                case 4:
                    mostrarPesonasConSusPerros(listaDePersonas);
                    break;
                case 5:
                    System.out.println("Ha salido del sistema muchas gracias");
                    break;
                default:
                    System.out.println("La opción ingresada no es valida.");
            }
        } while (opcion != 0);

    }

    private static void mostrarMenu() {
        System.out.println("--------------------------------");
        System.out.println("Menu de opciones");
        System.out.println("1- Cree su cuenta y adopte un perro");
        System.out.println("2- Si ya tiene cuenta y desea elegir un perro mas ");
        System.out.println("3- Mostra perros en adopción");
        System.out.println("4- Mostrar personaas con sus perros");
        System.out.println("0-Salir del sistema");
    }

    private static void crearUnaCuentaYAdoptarUnPerro(ArrayList<Persona> listaDePersonas, ArrayList<Perro> listaPerros, Scanner leer) {
        System.out.println("Bienvenido- Sistema de registro");
        System.out.println("--------------------------------");
        System.out.println("Ingrese sus datos perosnales");
        System.out.println("Ingrese su Nombre");
        String nombre = leer.next();
        System.out.println("Ingrese su apellido");
        String apellido = leer.next();
        System.out.println("Ingrese su edad");
        Integer edad = leer.nextInt();
        System.out.println("Ingrese su DNI");
        Integer dni = leer.nextInt();

        Persona personaNueva = new Persona(nombre, apellido, edad, dni, null);
        listaDePersonas.add(personaNueva);
        System.out.println("Se ha registrado satisfactoriamente");
        System.out.println("--------------------------------");

        //ADOPCION
        boolean seAdopto = false;
        int i = 1;
        mostrarPerrosEnAdopcion(listaPerros);

        //Adopcion
        System.out.println("Ingrese el nombre del perro que desea adoptar");
        String nombrePerroDeseado = leer.next();
        //recorre ,busca y elimina
        for (int j = 0; j < listaPerros.size(); j++) {
            if (nombrePerroDeseado.equals(listaPerros.get(j).getNombre())) {
                personaNueva.setPerro(listaPerros.get(j));
                seAdopto = true;
                listaPerros.remove(j);
            }
        }
        //mensaje de confirmacion
        mensajeDeConfirmación(seAdopto, nombrePerroDeseado);
//        for (Perro enAdopcion : listaPerros) {
//            if(enAdopcion.getNombre().equals(nombrePerroDeseado)){
//                personaNueva.setPerro(enAdopcion);
//                listaPerros.remove();
//            }
//        }
        mostrarPerrosEnAdopcion(listaPerros);
    }

    private static void mostrarPerrosEnAdopcion(ArrayList<Perro> listaPerros) {
        System.out.println("Lista de perros disponibles para adoptar: ");
        int i = 1;
        for (Perro perroActual : listaPerros) {
            System.out.println(i++ + " " + perroActual);
        }
    }

    private static void mostrarPesonasConSusPerros(ArrayList<Persona> listaDePersonas) {
        for (Persona persona : listaDePersonas) {
            System.out.println(persona);
        }
    }

    private static void mensajeDeConfirmación(boolean seAdopto, String nombrePerroDeseado) {
        if (seAdopto) {
            System.out.println("SE adopto a " + nombrePerroDeseado + " correctamente");
        } else {
            System.out.println("No se adopto . revise su selección");
        }
    }

}
