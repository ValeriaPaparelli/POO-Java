package Semana4.Banco;

public class CuentaCorriente extends Cuenta{
    private double montoDescubierto;

    public CuentaCorriente(double saldo, Cliente cliente, double montoDescubierto) {
        super(saldo, cliente);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void depositarDinero(double dinero){
        this.saldo += dinero;
        System.out.println("Usted deposito: $" + dinero + " Su saldo actual es de: $" + this.saldo);
    };

    @Override
    public void extraerDinero(double dinero){
        if(dinero <= this.saldo + this.montoDescubierto){
            this.saldo -= dinero;
            System.out.println(this.saldo);
        } else{
            System.out.println("Saldo insuficiente");
        }
    };

    public double getMontoDescubierto() {
        return montoDescubierto;
    }

    public void setMontoDescubierto(double montoDescubierto) {
        this.montoDescubierto = montoDescubierto;
    }
}

