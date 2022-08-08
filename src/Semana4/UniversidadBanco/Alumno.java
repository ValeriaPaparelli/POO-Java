package Semana4.UniversidadBanco;

public class Alumno {
    private String nombre;
    private String apellido;
    private Integer legajo;
    private Examen examen;

    public Alumno(String nombre, String apellido, Integer legajo, Examen examen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.examen = examen;
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

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
