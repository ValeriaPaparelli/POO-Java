package Semana4.Cuenta;

public class Cuenta {
    private String numero;
    protected double saldo;

    public Cuenta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void extraer(double importe){
        if (importe <= this.saldo) {
            this.saldo -= importe;
            System.out.println(this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(double importe){
        this.saldo += importe;
        System.out.println(this.saldo);
    }

    @Override
    public String toString(){
        return "numero: " + numero + "\n" + "saldo: " + saldo;
    }

    @Override
    public int hashCode(){
        int hash = 31;
        hash = hash* numero.hashCode();
        return hash;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
