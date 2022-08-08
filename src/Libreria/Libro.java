package Libreria;

public abstract class Libro {
    private String titulo;
    private Integer codigo;
    private double precioLista;
    private double precioPromo;

    public Libro(String titulo, Integer codigo, double precioLista, double precioPromo) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.precioLista = precioLista;
        this.precioPromo = precioPromo;
    }
    public abstract double serVendido();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(double precioLista) {
        this.precioLista = precioLista;
    }

    public double getPrecioPromo() {
        return precioPromo;
    }

    public void setPrecioPromo(double precioPromo) {
        this.precioPromo = precioPromo;
    }
}
