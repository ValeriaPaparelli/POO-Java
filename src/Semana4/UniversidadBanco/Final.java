package Semana4.UniversidadBanco;

public class Final extends Examen {
    private double notaOral;
    private String descripcionTema;

    public Final(String titulo, String enunciado, Integer nota, double notaOral, String descripcionTema) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    @Override
    public boolean estaAprobado(){
        boolean aprobado = getNota()>=4;
        return aprobado;
    };
}
