package empresaConstructora;

import java.util.ArrayList;

public class CompositeViviendaPremium implements Construible{
    private String nombre;
    private Integer bonificacion;
    private ArrayList<Construible> construcciones;

    public CompositeViviendaPremium(String nombre, Integer bonificacion) {
        this.nombre = nombre;
        this.bonificacion = bonificacion;
        this.construcciones = new ArrayList<>();
    }

    @Override
    public Double getPrecio(){
        double precioTotal = 0;
        for(Construible c : this.construcciones){
            precioTotal += c.getPrecio();
        }
        return precioTotal * (100 - this.bonificacion) / 100;
    }

    @Override
    public String getDetalle(){
        String detalle = "";
        for(Construible c : this.construcciones){
            detalle += c.getDetalle() + " - ";
        }
        return "Vivienda Premium: " + detalle + " El precio total es de: $" + this.getPrecio() + " dolares";
    }

    public void addConstruccion(Construible c){
        this.construcciones.add(c);
    }
}
