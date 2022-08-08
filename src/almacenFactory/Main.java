package almacenFactory;

import comboComposite.FactoryProductos;

public class Main {
    public static void main(String[] args) {
        AlmacenFactory almacen = AlmacenFactory.getInstance();

        Producto pelota = almacen.crearEspacio("PELOTAFUTBOL");
        System.out.println(pelota.calcularEspacio());

        Producto caja = almacen.crearEspacio("CAJA10X10");
        System.out.println(caja.calcularEspacio());
    }
}
