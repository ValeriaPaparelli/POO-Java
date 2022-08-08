package coleccionesPuerto;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Puerto BuenosAires = new Puerto("Buenos Aites");

        Contenedor contenedor1 = new Contenedor(1, "China", true);
        Contenedor contenedor2 = new Contenedor(2, "Brasil", true);
        Contenedor contenedor3 = new Contenedor(3, "Desconocida", true);
        Contenedor contenedor4 = new Contenedor(4, "Desconocida", true);
        Contenedor contenedor5 = new Contenedor(5, "Desconocida", true);
        Contenedor contenedor6 = new Contenedor(6, "Canadá", false);
        Contenedor contenedor7 = new Contenedor(7, "Rusia", false);

        BuenosAires.addContenedor(contenedor1);
        BuenosAires.addContenedor(contenedor2);
        BuenosAires.addContenedor(contenedor3);
        BuenosAires.addContenedor(contenedor4);
        BuenosAires.addContenedor(contenedor5);
        BuenosAires.addContenedor(contenedor6);
        BuenosAires.addContenedor(contenedor7);

        ArrayList <Contenedor> contenedores = BuenosAires.getContenedores();

        for (int i = 0; i < contenedores.size(); i++){
            System.out.println("Contenedor: " + (i + 1) + contenedores.get(i).toString());
        }

        BuenosAires.mostrarContenedoresEnOrden();

        System.out.println(BuenosAires.calcularCantPeligrosos());
    }
}
