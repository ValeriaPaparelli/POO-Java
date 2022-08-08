package comboComposite;

import java.util.ArrayList;

public class ComboComposite implements Comprable{
    private ArrayList<Comprable> productos; //Un ArrayList que tiene productos de tipo Comprables
    //El ArrayList tiene cosas que cumplen con un criterio
    private String nombre;

    public ComboComposite(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    @Override
    public Double getPrecio(){
        Double valorTotal = 0.0;
        for(Comprable comprable : this.productos){
            valorTotal += comprable.getPrecio();
        }
        return valorTotal * 0.9;
    }

    public void addProducto(Comprable comprable){
        this.productos.add(comprable);
    }

}
