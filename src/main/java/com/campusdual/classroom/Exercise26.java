package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {

        Contact contacto1 = new Contact("Santiago", "Fernández Rocha", "111222333");
        Contact contacto2 = new Contact("Carlos", "Fernández-Simón", "444555666");
        Contact contacto3 = new Contact("Javier", "López", "777888999");


        Phonebook phonebook = new Phonebook();


        phonebook.addContact(contacto1);
        phonebook.addContact(contacto2);
        phonebook.addContact(contacto3);


        System.out.println("Contactos en el listín telefónico:");
        phonebook.showPhonebook();


        System.out.println("\nEliminando el contacto con código: " + contacto2.getCode());
        phonebook.deleteContact(contacto2.getCode());

        System.out.println("Contactos tras la eliminación:");
        phonebook.showPhonebook();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu de acciones:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese los apellidos del contacto: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono del contacto: ");
                    String telefono = scanner.nextLine();
                    Contact nuevoContacto = new Contact(nombre, apellidos, telefono);
                    phonebook.addContact(nuevoContacto);
                    System.out.println("Contacto añadido exitosamente.");
                    break;

                case 2:
                    System.out.println("Mostrando contactos en el listín telefónico:");
                    phonebook.showPhonebook();
                    break;

                case 3:
                    System.out.print("Ingrese el código del contacto a eliminar: ");
                    String codigo = scanner.nextLine();
                    phonebook.deleteContact(codigo);
                    System.out.println("Contacto eliminado.");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
