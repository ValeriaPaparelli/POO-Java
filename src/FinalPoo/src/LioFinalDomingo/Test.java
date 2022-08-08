package FinalPoo.src.LioFinalDomingo;

public class Test {
    public static void main(String[] args) {
        OfertaAcademicaFactory fabrica = OfertaAcademicaFactory.getInstance();
        OfertaAcademica backend = fabrica.crearOfertaAcedemica("backend");
        OfertaAcademica frontend = fabrica.crearOfertaAcedemica("frontend");
        OfertaAcademica fullstack = fabrica.crearOfertaAcedemica("fullstack");

        System.out.println("Curso " + backend.getNombre() + " costo: " + backend.calcularPrecio());
        System.out.println("Curso " + frontend.getNombre() + " costo: " + frontend.calcularPrecio());
        System.out.println("Curso " + fullstack.getNombre() + " costo: " + fullstack.calcularPrecio());
    }
}
