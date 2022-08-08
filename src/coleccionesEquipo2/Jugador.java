package coleccionesEquipo2;

public class Jugador implements Comparable<Jugador>{ //Defino el tipo de dato <Jugador>, si no lo pongo estoy comparando objetos de tipo objeto
    //Comparable<Jugador> => Objetos de tipo Jugador
    private String posicion;
    private String apellido;
    private Integer nroCamiseta;

    public Jugador(String posicion, String apellido, Integer nroCamiseta) throws CamisetaInvalidaException {
        if(nroCamiseta < 1 || nroCamiseta >= 100){
            throw new CamisetaInvalidaException("La camiseta no puede ser 0 ni negativa , ni mayor a 99");
        }
        this.posicion = posicion;
        this.apellido = apellido;
        this.nroCamiseta = nroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(Integer nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    @Override
    public String toString(){
        return ("nombre: " + this.apellido + "número: " + this.nroCamiseta);
    }

    @Override
    public int compareTo(Jugador jugador) {
        if(this.nroCamiseta == jugador.getNroCamiseta()){
            return 0;
        }else if(this.nroCamiseta > jugador.getNroCamiseta()){
            return 1;
        }else{
            return 2;
        }
    }
}
