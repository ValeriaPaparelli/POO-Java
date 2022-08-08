package Semana2;

public class RefugioPerros {
    private boolean estaEnAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombre;
    private int edad;

    RefugioPerros(boolean estaEnAdopcion, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado, String nombre){
        this.estaEnAdopcion = estaEnAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombre = nombre;
    }

    public int calcularEdad(int anioNacimiento){
        return 2022 - anioNacimiento;
    }
    public void verificarPuedePerderse(){
        if(tieneChip){
            System.out.println("El perro no se puede perder");
        } else {
            System.out.println("El perro puede perderse ya que no tiene chip");
        }
    }
    public void verificarAdopcion(){
        if(estaEnAdopcion == true && estaLastimado != true && peso >= 5){
            System.out.println("El perro puede ser adoptado");
        } else {
            System.out.println("El perro no puede ser adoptado");
        }
    }

    public boolean isEstaEnAdopcion() {
        return estaEnAdopcion;
    }

    public void setEstaEnAdopcion(boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


