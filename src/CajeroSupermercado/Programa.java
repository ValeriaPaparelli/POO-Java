package CajeroSupermercado;

public class Programa {
    public static void main(String[] args) {
            CajeroSupermercado lola = new CajeroSupermercado("Lola", 1);

           Double monto = lola.aplicarDescuento(10.00, 1528.0);
           System.out.println(monto);

           Double monto2 = lola.aplicarRecargo(50.0, 100.0);
           System.out.println(monto2);

           Contador rodolfo = new Contador("Rodolfo", "UBA");

           System.out.println(rodolfo.aplicarIVA(200.00));
    }
}
