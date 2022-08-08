package Libreria;

import Libreria.Libro;

import java.util.Scanner;

public class LibroDigital extends Libro {

    private double tamanio;

    public LibroDigital(String titulo, Integer codigo, double precioLista, double precioPromo, double tamanio) {
        super(titulo, codigo, precioLista, precioPromo);
        this.tamanio = tamanio;
    }
    public double comprimirLibro(){
        return this.tamanio * 32.5 /100;//0.325
    };

    @Override
    public double serVendido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        String nombreApellido = scanner.nextLine();
        System.out.println("Ingrese su número de tarjeta");
        String numeroTarjeta = scanner.nextLine();
        return getPrecioLista()  * 0.9;
    };

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
