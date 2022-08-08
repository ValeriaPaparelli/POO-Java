package empresaNavetur;

public class Velero extends Embarcacion{
    private Integer cantMastiles;

    public Velero(double precioBase, double valorAdicional, Integer anioFabricacion, double eslora, Capitan capitan, Integer cantMastiles) {
        super(precioBase, valorAdicional, anioFabricacion, eslora, capitan);
        this.cantMastiles = cantMastiles;
    }
    @Override
    public double calcularMontoAlquiler(){
        if(getAnioFabricacion() >= 2020){
            return getPrecioBase() + getValorAdicional();
        } else {
            return getPrecioBase();
        }
    };

    public String evaluarTamanio(){
        if(this.cantMastiles >= 4){
            return "El velero es grande ya que tiene màs de 4 màstiles";
        }
        return "El velero no tiene la cantidad de màstiles suficientes";
    };

    public Integer getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(Integer cantMastiles) {
        this.cantMastiles = cantMastiles;
    }
}
