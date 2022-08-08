package coleccionesPuerto;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<Contenedor>();
    }

    public void addContenedor(Contenedor contenedor){
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedoresEnOrden(){
        for (int i = 0; i < contenedores.size(); i++){
            System.out.println(contenedores.get(i).getNumero());
        }
    }
    public int calcularCantPeligrosos(){
        int cantContenedoresPeligrosos = 0;
        for(int i = 0; i < contenedores.size(); i++){
            if(contenedores.get(i).isMaterialPeligroso() == true && contenedores.get(i).getPais() == "Desconocida"){
                cantContenedoresPeligrosos ++;
            }
        }
        return cantContenedoresPeligrosos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}
