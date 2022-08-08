package almacenFactory;

import java.util.ArrayList;

public class AlmacenFactory {
    private static AlmacenFactory instancia;
    private ArrayList<Producto> productos;

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    private AlmacenFactory(){
    }

    public static AlmacenFactory getInstance(){
        if(instancia == null)
            instancia = new AlmacenFactory();
        return instancia;
    }

    public Producto crearEspacio(String tipo){
        switch (tipo){
            case "CAJA10X10":
                return new Caja(10.0, 10.0, 10.0);
            case "PELOTAFUTBOL":
                return new Pelota(11.0);
            case "PELOTATENIS":
                return new Pelota(0.32);
            default:
                System.out.println("Ups, no se puede crear el espacio");
                return null;
        }
    }
}
