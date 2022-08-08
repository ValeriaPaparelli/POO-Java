package empresaNavetur;

public class Yate extends Embarcacion implements Comparable{
    private Integer cantCamarotes;

    public Yate(double precioBase, double valorAdicional, Integer anioFabricacion, double eslora, Capitan capitan, Integer cantCamarotes) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantCamarotes = cantCamarotes;
    }
    @Override
    public double calcularMontoAlquiler(){
        if(getAnioFabricacion() >= 2020){
            return getPrecioBase() + getValorAdicional();
        } else {
            return getPrecioBase();
        }
    };

    public Integer getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(Integer cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }
    
    @Override
    public int compareTo(Object object){
        //devuelve 0 => son iguales
        //devuelve 1 => es mayor el actual
        // devuelve 2 => es mayor el que recibe
        Yate yate = (Yate) object;
        if(this.cantCamarotes == yate.getCantCamarotes() ){
            return 0;
        } else if (this.cantCamarotes > yate.getCantCamarotes()) {
            return 1;
        } else {
            return 2;
        }
    }
}
