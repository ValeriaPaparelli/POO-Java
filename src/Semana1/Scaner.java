package Semana1;

/*Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
una tercera tus iniciales.*/

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();

        char inicial;
        inicial = nombre.charAt(0);
        inicial = apellido.charAt(0);

        System.out.println("Las iniciales de su nombre competo son: " + nombre.charAt(0) + "-" + apellido.charAt(0));

    }
}
