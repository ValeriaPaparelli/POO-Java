package Semana1;

/*Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
función debe comprobar si el primer número es divisible por el segundo.

boolean esDivisible(int n, int divisor)*/

import java.util.Scanner;

public class Funciones {

    public static boolean esDivisible(int numero, int divisor) {

        if (numero % divisor == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        System.out.println("Ingrese otro numero: ");
        int divisor = scanner.nextInt();

        System.out.println(esDivisible(numero, divisor));
    }
}


