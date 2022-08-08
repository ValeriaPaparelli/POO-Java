package empresaConstructora;

import java.util.ArrayList;

public class EmpresaConstructora {

    private String nombre;

    private ArrayList<Construible> construcciones;

    public EmpresaConstructora(String nombre) {
        this.nombre = nombre;
        this.construcciones = new ArrayList<>();
    }

    public void agregarConstruccion(Construible c){
        this.construcciones.add(c);
    }

    public void generarInforme(){
        System.out.println("La empresa " + this.nombre + " tiene las siguientes viviendas:");
        for(Construible c : this.construcciones){
            System.out.println(c.getDetalle());
        }
    }
}
