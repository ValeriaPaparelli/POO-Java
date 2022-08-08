package colecciones.equipo;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        Equipo LosLeones = new Equipo("Los Leones");

        Jugador jugador1 = new Jugador(10, "Lopez", true, false);
        Jugador jugador2 = new Jugador(9, "Messi", false, true);
        Jugador jugador3 = new Jugador(5, "Godoy", false, true);

        LosLeones.addJugador(jugador1);
        LosLeones.addJugador(jugador2);
        LosLeones.addJugador(jugador3);

        ArrayList jugadores = LosLeones.getJugadores(); //A la lista de jugadores la guardo en este variable

        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Nombre del jugador " + (i + 1) + " : " + jugadores.get(i).toString());
        }

        LosLeones.mostrarJugadoresTitulares();

        System.out.println(LosLeones.jugadoresLesionados());
    }
}