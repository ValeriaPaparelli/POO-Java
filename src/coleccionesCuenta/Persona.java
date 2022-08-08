package coleccionesCuenta;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Cuenta> cuentas;//Cada item del array es de tipo Cuenta-Es un Array list de tipo Cuenta
    //cuentas es una lista-array de objetos Cuenta
    public Persona(String nombre, String apellido, int edad) throws Exception{
        if(edad < 21){
            throw new Exception("No puede ser menor de 21");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cuentas = new ArrayList<Cuenta>();
    }

    public void addCuenta(Cuenta cuenta) { //Recibo una cuenta de tipo Cuenta
        this.cuentas.add(cuenta); //al ArrayList de cuentas le agrego una cuenta
    }

    public String getNombreCompleto(){
        return this.nombre + this.apellido;
    }

    public boolean esMayorEdad(){
        if(this.edad > 60){
            return true;
        }
        return false;
    }

    public Double getSaldoTotal(){
        Double saldoTotal = 0.0;
        for(int i = 0; i < this.cuentas.size(); i++){
            saldoTotal += this.cuentas.get(i).getSaldo();
        }
        return saldoTotal;
    }

    public void mostrarCuentas(){
        for(Cuenta cuenta : cuentas){ //Recorro cuentas-
            System.out.println(cuenta); //cta-referencia al elemento que se itera-variable temporal que tiene el item que está iterando
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}