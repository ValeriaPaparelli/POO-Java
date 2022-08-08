package Semana4.UniversidadBanco;

public abstract class Examen {
    private String titulo;
    private String enunciado;
    private Integer nota;

    public Examen(String titulo, String enunciado, Integer nota) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public abstract boolean estaAprobado();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
