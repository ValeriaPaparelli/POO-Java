package Semana2;

//Variables y mètodos de Clase

public class Camion {
    private String marca;
    private String patente;
    static private double valorCombustible;//Defino la variable como static. Esto hace que no se pueda usar con un objeto
    //Es un atributo de clase. Puede ser invocado por el mètodo static

    Camion(String marca, String patente){
        this.marca = marca;
        this.patente = patente;
    }

    public double gastoCombustible(int litros){
        return litros*Camion.valorCombustible;
    }

    static public void cambiarPrecioCombustible(double precio){//Definimos el mètodo como static
        Camion.valorCombustible=precio; //Accedemos a la variable de clase (atributo de clase-static) y podemos cambiar su valor
        //el mètodo lo setea la clase
    }
}
