package Libreria;

import Libreria.Libro;

public class Usuario {
    private String nombreApellido;
    private String domicilio;
    private Integer edad;
    private Libro libro;

    public Usuario(String nombreApellido, String domicilio, Integer edad, Libro libro) {
        this.nombreApellido = nombreApellido;
        this.domicilio = domicilio;
        this.edad = edad;
        this.libro = libro;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
