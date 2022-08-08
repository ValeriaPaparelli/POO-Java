package coleccionesCuenta;

public class Cuenta implements Comparable{
    private int nroCuenta;
    private Double saldo;

    public Cuenta(int nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object object) {
        Cuenta cuenta = (Cuenta) object;

        if(this.nroCuenta == cuenta.getNroCuenta()){
            return 0;
        }else if(this.nroCuenta > cuenta.getNroCuenta()){
            return 1;
        }else{
            return 2;
        }
    }
}