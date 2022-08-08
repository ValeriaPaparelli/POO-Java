package Semana4.Empresa;

public class EmpleadoMarketing  extends Empleado{
    private String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    @Override //Sobreescribir => es idéntico
    public void trabajar(){
        System.out.println("Empleado de Marketing " + getNombre() + " trabajando en " + area);
    }

    public void trabajar(int horasExtras){ //Sobrecarga => Tiene el mismo nombre pero diferentes parámetros
        System.out.println("Empleado de Marketing " + getNombre() + " trabajando en " + area + " con " + horasExtras + " horasExtras");
    }
}
