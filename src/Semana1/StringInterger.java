package Semana1;

/*Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.*/

/*Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
Informar el resultado obtenido.*/

public class StringInterger {
    public static void main(String[] args) {
        String nombre1 = "Fran";
        String nombre2 = "Vale";

        if(nombre1.equals(nombre2)){
            System.out.println("Son el mismo nombre");
        }else {
            System.out.println("No son el mismo nombre");
        }

        Integer num1 = 2;
        Integer num2 = 5;

        if(num1.equals(num2)){
            System.out.println("Son iguales");
        }

        int comparar;

        if(num1.equals(num2))
            System.out.println("Son el mismo número");
        else {
            comparar = num1.compareTo(num2);
            if(comparar  > 0){
                System.out.println(num1 + " " + "es el mayor");
            }else{
                System.out.println(num2 + " " + "es el mayor");
            }
        }
    }
}




