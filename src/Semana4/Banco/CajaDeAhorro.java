package Semana4.Banco;

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(double saldo, Cliente cliente, double tasaDeInteres) {
        super(saldo, cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void depositarDinero(double dinero){
        this.saldo += dinero;
        System.out.println("Usted deposito: $" + dinero + " Su saldo actual es de: $" + this.saldo);
    };

    @Override
    public void extraerDinero(double dinero){
        if(dinero <= this.saldo){
            this.saldo -= dinero;
        }
        System.out.println("Su saldo actual es de: " + this.saldo);
    };

    public void cobrarInteres(){
        System.out.println("");
    }

    public double getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}

