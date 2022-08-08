package Semana4.Cuenta;

import Semana4.Cuenta.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        //EmpleadoMarketing empl1 = new EmpleadoMarketing("Pedro", "Sanchez", "123456", "Redes Sociales");
        //empl1.trabajar();
        //empl1.trabajar(4);

        CuentaCorriente cuentaPedro = new CuentaCorriente("12345", 2000.00);
        cuentaPedro.extraer(2500.00);
        cuentaPedro.extraer(1000.00);
        cuentaPedro.depositar(500.00);
        cuentaPedro.extraer();
        cuentaPedro.extraer();



        //cuentaPedro.toString();
        //System.out.println(cuentaPedro.toString());
        //System.out.println(cuentaPedro.hashCode());

    }
}
