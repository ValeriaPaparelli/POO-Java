package empresaNavetur;

public class Programa {
    public static void main(String[] args) {
        Velero velero1 = new Velero(500.00, 100.00, 1990, 30.00,
                new Capitan("Francisco", "Lopez", 1234), 5);

        Velero velero2 = new Velero(500.00, 100.00, 2022, 40.00,
                new Capitan("Valeria", "Paparelli", 4321), 2);

        System.out.println(velero1.calcularMontoAlquiler());
        System.out.println(velero1.evaluarTamanio());
        System.out.println(velero2.calcularMontoAlquiler());
        System.out.println(velero2.evaluarTamanio());

        Yate yate1 = new Yate(700.00, 200.00, 1990, 30.00,
                new Capitan("Francisco", "Lopez", 1234), 5);

        Yate yate2 = new Yate(700.00, 200.00, 2022, 30.00,
                new Capitan("Francisco", "Lopez", 1234), 2);

        Yate yate3 = new Yate(700.00, 200.00, 2022, 30.00,
                new Capitan("Francisco", "Lopez", 1234), 8);

        System.out.println(yate1.calcularMontoAlquiler());
        System.out.println(yate2.compareTo(yate3));
        System.out.println(yate3.compareTo(yate1));
    }
}
