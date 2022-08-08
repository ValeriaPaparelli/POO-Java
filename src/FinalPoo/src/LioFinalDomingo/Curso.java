package FinalPoo.src.LioFinalDomingo;

public class Curso extends OfertaAcademica {
    private Double cargaHoras;
    private Integer cantidadMeses;
    private Double precioXHoras;

    public Curso(Double cargaHoras,Integer cantidadMeses,Double precioXHoras, String nombre, String descripcion) {
        super(nombre, descripcion);
        this.cargaHoras = cargaHoras;
        this.cantidadMeses = cantidadMeses;
        this.precioXHoras = precioXHoras;
    }

    @Override
    public Double calcularPrecio() {
        return this.cantidadMeses*this.precioXHoras*this.cargaHoras;
    }
}
