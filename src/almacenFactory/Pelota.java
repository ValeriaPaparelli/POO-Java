package almacenFactory;

public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio(){
        return this.radio*this.radio*this.radio*Math.PI;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
}
