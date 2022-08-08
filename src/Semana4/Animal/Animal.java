package Semana4.Animal;

public abstract class Animal {
    private String nombre;
    private Integer edad;

    public Animal(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerRuido();// Sin llaves-Los mètodos abstractos no tienen un comportamiento establecido
}
