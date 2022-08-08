package coleccionesCuenta;

public class Program {
    public static void main(String[] args) {

        try {
            Persona persona1 = new Persona("Valeria", "Paparelli", 36);
            Persona persona2 = new Persona("Francisco", "Lopez", 63);
            Persona persona3 = new Persona("Maia", "Nardi", 20);

            Cuenta cuenta1 = new Cuenta(123456, 11100.00);
            Cuenta cuenta2 = new Cuenta(654321, 0.0);
            Cuenta cuenta3 = new Cuenta(789987, 3000.00);

            persona1.addCuenta(cuenta1);
            persona1.addCuenta(cuenta2);
            persona1.addCuenta(cuenta3);

            System.out.println(persona2.esMayorEdad());

            System.out.println(persona1.getNombreCompleto() + " " + "$" + persona1.getSaldoTotal());

            System.out.println(cuenta2.compareTo(cuenta1));
        } catch (Exception exception) {
            System.err.println("No puede ser menor de 21");
        }
    }
}