package Semana2;

public class Cuenta {

    private int numeroDeCuenta;
    private double saldo;

    public Cuenta (int numeroDeCuenta, double saldo){
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public void depositar(Double cantDeDinero){
        this.saldo = this.saldo + cantDeDinero;
    }

    public void retirar(Double cantDeDinero){
        if(this.saldo >= cantDeDinero){
            this.saldo = this.saldo - cantDeDinero;
        }
    }

    public void setNumeroDeCuenta(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public int getNumeroDeCuenta(){
        return numeroDeCuenta;
    }
    public Double getSaldo() {
        return saldo;
    }
}
