package Semana4.Cuenta;

import Semana4.Cuenta.Cuenta;

public class CuentaCorriente extends Cuenta {
    private double descubierto;

    public CuentaCorriente(String numero, double saldo){
        super(numero, saldo);
        this.descubierto = 1000;
    }

    @Override
    public void extraer(double importe){
        if(importe <= this.saldo + this.descubierto){
            this.saldo -= importe;
            System.out.println(this.saldo + this.descubierto);
        } else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double importe){
        double saldoTotal = saldo += descubierto;
        System.out.println(saldoTotal += importe);
    }

    public void extraer(){
        if(this.descubierto == 1000){
            this.descubierto -= 1000;
            System.out.println(this.descubierto);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(double descubierto) {
        this.descubierto = descubierto;
    }
}

