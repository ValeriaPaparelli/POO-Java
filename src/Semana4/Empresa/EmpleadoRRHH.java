package Semana4.Empresa;

public class EmpleadoRRHH extends Empleado{
    private int altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }

    @Override
    public void trabajar(){
        System.out.println("Empleado de RRHH " + getNombre() + "trabajando");
    }
}
