package coleccionesEquipo2;

public class Program {
    public static void main(String[] args) {

        //Para manejar la excepción tengo que atrapar en un try y catch la parte del código que rompe

        try{
            Equipo seleccion = new Equipo("seleccion Persa");
            Jugador pepe1 = new Jugador("ARQUERO", "Lopez1", 7);
            Jugador pepe2 = new Jugador("DEFENSOR", "Lopez2", 1);
            Jugador pepe3 = new Jugador("MEDIOCAMPISTA", "Lopez3", 3);
            Jugador pepe4 = new Jugador("MEDIOCAMPISTA", "Lopez4", 4);
            Jugador pepe5 = new Jugador("DEFENSOR", "Lopez5", 2);
            Jugador pepe6 = new Jugador("MEDIOCAMPISTA", "Lopez6", 5);
            Jugador pepe7 = new Jugador("DELANTERO", "Lopez7", 6);
            Jugador pepe8 = new Jugador("DEFENSOR", "Lopez8", 8);
            Jugador pepe9 = new Jugador("MEDIOCAMPISTA", "Lopez9", 9);
            Jugador pepe10 = new Jugador("DELANTERO", "Lopez10", 10);
            Jugador pepe11 = new Jugador("“DEFENSOR", "Lopez11", 11);
            Jugador pepe12 = new Jugador("DELANTERO", "Lopez12", 12);
            Jugador pepe13 = new Jugador("DEFENSOR", "Lopez13", 13);
            Jugador pepe14 = new Jugador("DELANTERO", "Lopez14", 14);
            Jugador pepe15 = new Jugador("DEFENSOR", "Lopez15", 15);
            Jugador pepe16 = new Jugador("DELANTERO", "Lopez16", 16);
            Jugador pepe17 = new Jugador("MEDIOCAMPISTA", "Lopez17", 17);
            Jugador pepe18 = new Jugador("DELANTERO", "Lopez18", 18);
            Jugador pepe19 = new Jugador("MEDIOCAMPISTA", "Lopez19", 19);
            Jugador pepe20 = new Jugador("ARQUERO", "Lopez20", 20);
            Jugador pepe21 = new Jugador("DEFENSOR", "Lopez21", 21);
            Jugador pepe22 = new Jugador("DELANTERO", "Lopez22", 22);
            Jugador pepe23 = new Jugador("MEDIOCAMPISTA", "Lopez23", 23);

            seleccion.addJugador(pepe1);
            seleccion.addJugador(pepe2);
            seleccion.addJugador(pepe3);
            seleccion.addJugador(pepe4);
            seleccion.addJugador(pepe5);
            seleccion.addJugador(pepe6);
            seleccion.addJugador(pepe7);
            seleccion.addJugador(pepe8);;
            seleccion.addJugador(pepe9);
            seleccion.addJugador(pepe10);
            seleccion.addJugador(pepe11);
            seleccion.addJugador(pepe12);
            seleccion.addJugador(pepe13);
            seleccion.addJugador(pepe14);
            seleccion.addJugador(pepe15);
            seleccion.addJugador(pepe16);
            seleccion.addJugador(pepe17);
            seleccion.addJugador(pepe18);
            seleccion.addJugador(pepe19);
            seleccion.addJugador(pepe20);
            seleccion.addJugador(pepe21);
            seleccion.addJugador(pepe22);
            seleccion.addJugador(pepe23);

            Integer cantidadArqueros = seleccion.cantJugadores("ARQUERO");
            System.out.println(cantidadArqueros);
        } catch (CamisetaInvalidaException exception){
            System.err.println("La camiseta no puede ser 0 ni negativa , ni mayor a 99");
        };

          /*
        for( int i=0; i<jugadores.size(); i++){
            System.out.println("Nombre de jugador " + (i+1) + " : " + jugadores.get(i).toString());
        }*/
    }
}
