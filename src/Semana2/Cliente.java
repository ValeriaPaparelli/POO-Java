package Semana2;

public class Cliente {
    private Integer numeroCliente;
    private String nombre;
    private Double deuda;

    Cliente(Integer numeroCliente, String nombre, Double deuda){
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.deuda = deuda;
    }

    public void incrementarDeuda(Double valor){
        deuda += valor;
    }

    public void pagarDeuda(){

    }

    public Integer getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
}
