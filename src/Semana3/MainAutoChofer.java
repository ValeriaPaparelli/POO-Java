package Semana3;

public class MainAutoChofer {
    public static void main(String[] args) {
        Chofer chofer = new Chofer("Juan", "Perez", new Auto("abc123", "Forde", "modelo"));
        //Cuando se crea el chofer se crea el auto que le corresponde asignarle a el
        //Tenemos un objeto o instancia de la clase chofer

        //Auto auto1 = new Auto("abc123", "Forde", "modelo");
        //chofer1 = new Chofer("Juan", "Perez", auto1);

        System.out.println("Patente del auto asignado: " + chofer.verPatente());
    }
}
