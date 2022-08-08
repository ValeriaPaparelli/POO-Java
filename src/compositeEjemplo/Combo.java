package compositeEjemplo;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprables;

    public Combo() {//Lo creamos para inicializar la lista
        comprables = new ArrayList<>();
    }

    public Double calcularPrecio(){
        Double precioTotal = 0.0; //For que recorreo cada uno de estos comprables
        for (Comprable comprable: comprables ) { //Por cada comprable en nuestra lista de comprables va a ejecutar el código
            precioTotal += comprable.calcularPrecio(); //Si el comprable es un producto individual va a devolver su precio
        }                                              //y si es un combo va a seguir recorriendolo hasta que encuentre un producto individual
        return precioTotal; //suma el precio total de nuestro combo
    }
}
