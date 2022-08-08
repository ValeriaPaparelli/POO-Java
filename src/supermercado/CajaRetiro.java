package supermercado;

public class CajaRetiro extends Caja{
    private double cantDineroEfectivo;
    private Integer cantUnidades;
    private String categoria;

    public CajaRetiro(Integer cantDinero, Integer cantTickkets, boolean aceptaTarjeta, Persona persona, double cantDineroEfectivo, Integer cantUnidades, String categoria) {
        super(cantDinero, cantTickkets, aceptaTarjeta, persona);
        this.cantDineroEfectivo = cantDineroEfectivo;
        this.cantUnidades = cantUnidades;
        this.categoria = categoria;
    }

    @Override
    public String poderRetirarTickets(){
        if(getCantTickkets() >= 100){
            return "Puede retirar tickets del depòsito";
        }
        return "No puede retirar tickets del depòsito";
    };


    public String esCajaRapida(){
       if(getCategoria() == "rapida"){
           return "Es caja rápida";
       } else {
           return "No es caja rápida";
       }
    }

    public double getCantDineroEfectivo() {
        return cantDineroEfectivo;
    }

    public void setCantDineroEfectivo(double cantDineroEfectivo) {
        this.cantDineroEfectivo = cantDineroEfectivo;
    }

    public Integer getCantUnidades() {
        return cantUnidades;
    }

    public void setCantUnidades(Integer cantUnidades) {
        this.cantUnidades = cantUnidades;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
