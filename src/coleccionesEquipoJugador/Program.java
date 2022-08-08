package coleccionesEquipoJugador;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Equipo river = new Equipo("River");

        Jugador jugador1 = new Jugador(10, "Horacio", false, true);
        Jugador jugador2 = new Jugador(8, "Horacio", true, true);
        Jugador jugador3 = new Jugador(9, "Horacio", true, true);
        Jugador jugador4 = new Jugador(6, "Horacio", false, true);
        Jugador jugador5 = new Jugador(4, "Horacio", false, false);
        Jugador jugador6 = new Jugador(3, "Horacio", false, true);

        river.addJugador(jugador1);
        river.addJugador(jugador2);
        river.addJugador(jugador3);
        river.addJugador(jugador4);
        river.addJugador(jugador5);
        river.addJugador(jugador6);

        river.mostrarJugadoresTitulares();

        System.out.println("Cantidad de lesionados: " + river.getCantidadJugadoresLesionados());
    }
}
