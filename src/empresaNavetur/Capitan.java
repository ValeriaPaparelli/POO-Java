package empresaNavetur;

public class Capitan {

    private String nombre;
    private String apellido;
    private Integer numMatricula;

    public Capitan(String nombre, String apellido, Integer numMatricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numMatricula = numMatricula;
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

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }
}
