package CajeroSupermercado;

public  class Calculadora { //Todas las operaciones quedan condensadas acà

    //Atributo privado y estático
    private static Calculadora instance;//La calculadora tiene una instancia de si misma

    //Constructor privado
    private Calculadora(){ //El único que puede hacer un new de Calculadora es Calculadora

    }

    //Método privado
    public static Calculadora getInstance(){
        if(instance == null){
            instance = new Calculadora();
        }
        return instance;
    }
    public Double aplicarDescuentos(Double monto, Double porcentajeDescuento){
        return monto*(100-porcentajeDescuento);
    }

    public Double aplicarIncremento(Double monto, Double porcentajeIncremento){
        return monto*(100+porcentajeIncremento);
    }

    public Double restarMonto(Double monto, Double cantidadARestar){
        return monto - cantidadARestar;
    }
    public Double sumarMonto(Double monto, Double cantidadASumar){
        return monto + cantidadASumar;
    }
}
