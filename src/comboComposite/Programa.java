package comboComposite;

public class Programa {
    public static void main(String[] args) {
        FactoryProductos fac = FactoryProductos.getInstance();

        Comprable dobleQueso = fac.crearProductoComprable("doble queso");
        System.out.println(dobleQueso.getPrecio());

        Comprable combo = fac.crearProductoComprable("premium");
        System.out.println(combo.getPrecio());


    }

}
