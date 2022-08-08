package coleccionesEquipoJugador;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        for (int i=0; i < this.jugadores.size(); i++){
            System.out.println(jugadores.get(i).getNombre() + " es titular: " + jugadores.get(i).isTitular());
        }
    }

    public int getCantidadJugadoresLesionados(){
        int jugadoresLesionados = 0;
        for (int i=0; i < this.jugadores.size(); i++){
            if(this.jugadores.get(i).isLesionado()){
                jugadoresLesionados++;
            }
        }
        return jugadoresLesionados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
