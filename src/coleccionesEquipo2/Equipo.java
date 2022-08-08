package coleccionesEquipo2;

import java.util.ArrayList;

public class Equipo {
    private String nombreSeleccion;
    private ArrayList<Jugador> plantel; //Guardo cosas de tipo jugador
    //0 a 10: tirulares - 11 a 17: suplentes - 18 a 22: reservados

    public Equipo(String nombreSeleccion) { //No se suele pasar como atributo la lista
        this.nombreSeleccion = nombreSeleccion;
        this.plantel = new ArrayList<>();//Si tengo que inicializarla la lista
    }

    public ArrayList<Jugador> obtenerReservas(){
        ArrayList<Jugador> reservas = new ArrayList<>(); //Creo un nuevo Array para guardar las lista de jugadores de reserva
        for(int i = 18; i < this.plantel.size(); i++){ //Recorro las posiciones de la lista donde se encuentran los jugadores de reserva
            Jugador jugadorDeReservaActual = this.plantel.get(i); //Atrapo en la primera iteración un jugador en una variable auxiliar y lo agrego al de reservas
            reservas.add(jugadorDeReservaActual);
            //reservas.add(this.plantel.get(i)); - O directamente lo hacemos de esta manera
        }
        return reservas;
    }

    public Integer cantJugadores(String posicion) {
        Integer cantJugadoresEnPosicion = 0;
        for(Jugador jugador : this.plantel){ //La variable jugador de tipo Jugador está en una lista que se llama plantel
            if(jugador.getPosicion().equals(posicion)){//equals para comparar strings - Si la posición de la lista es igual a la posición que recibo contabilizo
                cantJugadoresEnPosicion ++;
            }
        }
        return cantJugadoresEnPosicion;
    }

   public void addJugador (Jugador jugador){//()Le paso un jugador de tipo jugador
        //if(plantel == null){
            //this.plantel = new ArrayList<>(); //Esto lo hago en el caso de no instanciarlo en el constructor
        //}
        this.plantel.add(jugador);
    }

}
