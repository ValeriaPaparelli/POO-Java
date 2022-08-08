package Semana3;

public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    //private Motor motor; Objeto motor que es atributo del auto - atributo definido pero no instanciado

    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        //motor = new Motor(); los atributos de las clases que son objetos los instancio en el constructor
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
