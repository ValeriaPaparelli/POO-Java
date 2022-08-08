package Semana4.Banco;

public class Cliente {
    private Integer numCliente;
    private String apellido;
    private Integer dni;
    private String cuit;

    public Cliente(Integer numCliente, String apellido, Integer dni, String cuit) {
        this.numCliente = numCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public Integer getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(Integer numCliente) {
        this.numCliente = numCliente;
    }
}