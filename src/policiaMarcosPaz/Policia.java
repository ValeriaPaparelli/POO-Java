package policiaMarcosPaz;

public class Policia {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Arma arma;

    public Policia(String nombre, String apellido, Integer legajo, Arma arma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
