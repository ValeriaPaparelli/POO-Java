package Semana4.UniversidadBanco;

public class Parcial extends Examen {
    private Integer numUnidad;
    private Integer numReintentos;

    public Parcial(String titulo, String enunciado, Integer nota, Integer numUnidad, Integer numReintentos) {
        super(titulo, enunciado, nota);
        this.numUnidad = numUnidad;
        this.numReintentos = numReintentos;
    }
    @Override
    public boolean estaAprobado(){
        boolean aprobado = getNota()>=4;
        return aprobado;
    };

    public String sePuedeRecuperar(){
        if (this.numUnidad <= 3) {
            return "se puede recuperar hasta 3 veces";
        } else {
            return "se puede recuperar hasta 2 veces";
        }
    }
}
