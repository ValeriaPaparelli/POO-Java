package Semana4.Animal;

public class MainAnimal {
    public static void main(String[] args) {

        //Escribimos una variable de tipo Animal
        Animal animal = new Perro("Firulais", 4);

        //Reasigno la variable
        animal = new Gato("Panchito", 5);

        //Gracias al polimorfismo sabe que ruido tiene que hacer
        animal.hacerRuido();
    }
}
