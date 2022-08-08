package Semana4.Animal;

public class Gato extends Animal{

    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }

    //Sobreescribimos la responsabilidad de hacerRuido

    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
