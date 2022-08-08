package coleccionesEquipoJugador;

public class Jugador {
    private int nroDeCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroDeCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroDeCamiseta = nroDeCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNroDeCamiseta() {
        return nroDeCamiseta;
    }

    public void setNroDeCamiseta(int nroDeCamiseta) {
        this.nroDeCamiseta = nroDeCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
