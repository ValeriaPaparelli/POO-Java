package CajeroSupermercado;

public class CajeroSupermercado {
    private String nombre;
    private Integer id;
    private Calculadora instance = Calculadora.getInstance();
    public CajeroSupermercado(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Double aplicarDescuento(Double porcentaje, Double monto){
        return this.instance.aplicarDescuentos(monto, porcentaje);
    }

    public Double aplicarRecargo(Double recargo, Double monto){
        return this.instance.aplicarIncremento(monto, recargo);
    }
}
