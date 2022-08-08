package empresaConstructora;

public class Casa implements Construible{
    private String tipo;
    private Double metros;
    private Double valorPorMetro;
    private Integer cantAmbientes;


    public Casa(String tipo, Double metros, Double valorPorMetro, Integer cantAmbientes) {
        this.tipo = tipo;
        this.metros = metros;
        this.valorPorMetro = valorPorMetro;
        this.cantAmbientes = cantAmbientes;
    }

    @Override
    public Double getPrecio(){
        return this.metros * this.valorPorMetro;
    }

    @Override
    public String getDetalle(){
        return "Casa " + this.tipo + " " + this.metros + " metros, precio $" + this.getPrecio() + " dolares.";
    }
}
