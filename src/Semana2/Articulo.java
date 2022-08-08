package Semana2;

public class Articulo {
    private String descripcion;
    private double precioVenta;
    private int stock;

    public Articulo(String descripcion, int cantidad, double precio){ //Constructor
        //Tiene como parámetros los 3 valores que tengo que asignarles inicialmente a los atributos
        this.descripcion=descripcion; //Usamos this si el parametro tiene el mismo nombre que el atributo
        precioVenta=precio;
        stock=cantidad;
    }

    public String getDescripcion(){ //get permite acceder al valor de un atributo
        return descripcion;}

    public double getPrecioVenta(){
        return precioVenta;}

    public int getStock(){
        return stock;}

    public void setDescripcion(String descripcion){ //set permite cambiar el valor de un atributo-Recibe por parámetro el nuevo valor
        this.descripcion= descripcion;} //Para diferenciar el atributo del parámetro que tiene el mismo nombre usamos this
        //this hace referencia al objeto o instancia con el que se está trabajando
    public void setPrecioVenta(double precio){
        precioVenta=precio; }

    public void setStock(int stock){
        this.stock=stock;}
    public boolean hayStock(){
        return stock>0;
    }
    public double consultarPrecio(){
        return precioVenta;
    }
}
