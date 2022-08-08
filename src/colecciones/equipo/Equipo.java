package colecciones.equipo;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Jugador>();
    }

    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares(){
        for(int i = 0; i < this.jugadores.size(); i++){
            if(this.jugadores.get(i).isEsTitular()){
                System.out.println(jugadores.get(i).getNombre() + " " + "es titular");
            }
        }
    }

    /*public void jugadoresLesionados(){
        for(Jugador jugador : this.jugadores){
            if(jugador.isEstaLesionado()){
                System.out.println(jugador.getNombre() + " " + "está lesionado ");
            }
        }
    }*/

    public int jugadoresLesionados(){
        int cantJugadoresLesionados = 0;
        for(Jugador jugador : this.jugadores){
            if(jugador.isEstaLesionado()){
               cantJugadoresLesionados ++;
            }
        }
        return cantJugadoresLesionados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    } //Para obtener los jugadores

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}