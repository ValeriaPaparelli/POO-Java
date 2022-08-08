package almacenFactory;

public abstract class Producto {
    private Double peso;

    public abstract Double calcularEspacio();

    public Double calcularEspacioNecesario(){
        return 1.2;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
