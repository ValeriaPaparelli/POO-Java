package Libreria;

import Libreria.Enviable;
import Libreria.Libro;

import java.util.Scanner;

public class LibroFisico extends Libro implements Enviable {
    public LibroFisico(String titulo, Integer codigo, double precioLista, double precioPromo) {
        super(titulo, codigo, precioLista, precioPromo);
    }

    @Override
    public double serVendido() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre y apellido");
        String nombreApellido = scanner.nextLine();
        return getPrecioLista();
    };

    @Override
    public void Enviar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su dirección");
        String dirección = scanner.nextLine();
    };
}
