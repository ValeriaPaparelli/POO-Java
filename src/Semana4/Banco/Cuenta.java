package Semana4.Banco;

public abstract class Cuenta {
    protected double saldo;
    private Cliente cliente;

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public abstract void depositarDinero(double dinero);

    public abstract void extraerDinero(double dinero);

    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + this.saldo);
    }

}

