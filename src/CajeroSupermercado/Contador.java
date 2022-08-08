package CajeroSupermercado;

public class Contador {
    private String nombre;
    private String universidad;
    private Calculadora instance = Calculadora.getInstance();

    public Contador(String nombre, String universidad) {
        this.nombre = nombre;
        this.universidad = universidad;
    }

    public Double aplicarIVA(Double monto){
        return this.instance.aplicarIncremento(monto, 22.0);
    }

    public Double impuestoALaVenta(Double monto){
        return this.instance.aplicarIncremento(monto, 50.0);
    }
}
