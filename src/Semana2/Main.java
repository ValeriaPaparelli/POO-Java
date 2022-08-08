package Semana2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ARTICULO

        //Creamos un objeto o instancia de la clase Articulo.

        /*Articulo articulo = new Articulo("Articulo 1", 100, 1100.00);

        if (articulo.hayStock()) //Utilizamos el método hay stock
        {
         System.out.println("Hay stock disponible");
        }
        System.out.println("El precio de venta es "  + articulo.consultarPrecio());*/

        //CUENTA

        /*Cuenta cuenta = new Cuenta(345672, 20000);

        System.out.println("El numero de cuenta es "  + cuenta.getNumeroDeCuenta());
        System.out.println("El saldo es "  + cuenta.getSaldo());*/

        //USUARIO JUEGO

        /*UsuarioJuego jugador1 = new UsuarioJuego("Valeria", "1234");

        System.out.println("El puntaje inicial es "+ jugador1.getPuntaje());
        jugador1.aumentarPuntaje();
        System.out.println("El puntaje nuevo es "+ jugador1.getPuntaje());
        jugador1.bonus(4);
        System.out.println("El puntaje por bonus es de: " + jugador1.getPuntaje());*/

        //CLIENTE

        //Cliente cliente1 = new Cliente(1, "Valeria", 3000.00);

        //CAMIÓN

        /*Camion miCamion = new Camion("Ford", "AB XXX CD");

        Camion.cambiarPrecioCombustible(98.50); //Utilizamos el método de clase a través de la clase y no del objeto.

        System.out.println("Gasto " + miCamion.gastoCombustible(40));*/

        RefugioPerros perro1 = new RefugioPerros(true, "caniche", 2015, 7, false, false, "Canichin");

        /*Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del perro");
        String edadPerro1 = scanner.nextLine();
        System.out.println(perro1.getNombre() + " tiene " + edadPerro1 + " anios");*/

        System.out.println("El perro tiene " + perro1.calcularEdad(perro1.getAnioNacimiento()));

        perro1.verificarPuedePerderse();

        perro1.verificarAdopcion();

        RefugioPerros perro2 = new RefugioPerros(false, "golden", 2018, 7, true, false, "goldensin");

        /*System.out.println("Ingrese la edad del perro");
        String edadPerro2 = scanner.nextLine();
        System.out.println(perro2.getNombre() + " tiene " + edadPerro2 + " anios");*/

        System.out.println("El perro tiene " + perro2.calcularEdad(perro2.getAnioNacimiento()));

        perro2.verificarPuedePerderse();

        perro2.verificarAdopcion();

    }
}