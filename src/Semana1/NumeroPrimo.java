package Semana1;

import java.util.Scanner;

public class NumeroPrimo {
    public static boolean esPrimo (int numero) {

        boolean respuesta= true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                respuesta = false;
            }
        }
        return respuesta;
    }

    public static void main(String[] args) {

        System.out.println("Vamos a trabajar con numeros primos");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        System.out.println(esPrimo(numero));
    }

}
