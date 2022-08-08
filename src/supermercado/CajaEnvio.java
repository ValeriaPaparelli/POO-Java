package supermercado;

public class CajaEnvio extends Caja implements Comparable{
    private Integer cantPedidos;
    private Integer cantCamiones;

    public CajaEnvio(Integer cantDinero, Integer cantTickkets, boolean aceptaTarjeta, Persona persona, Integer cantPedidos, Integer cantCamiones) {
        super(cantDinero, cantTickkets, aceptaTarjeta, persona);
        this.cantPedidos = cantPedidos;
        this.cantCamiones = cantCamiones;
    }

    @Override
    public String poderRetirarTickets(){
        if(getCantTickkets() >= 100){
            return "Puede retirar tickets del depòsito";
        }
        return "No puede retirar tickets del depòsito";
    };

    @Override
    public int compareTo(Object object){
        CajaEnvio cajaEnvio = (CajaEnvio) object;
        if(this.cantPedidos == cajaEnvio.getCantPedidos()){
            return 0;
        } else if(this.cantPedidos > cajaEnvio.getCantPedidos()){
            return 1;
        } else{
            return 0;
        }
    }

    public Integer getCantPedidos() {
        return cantPedidos;
    }

    public void setCantPedidos(Integer cantPedidos) {
        this.cantPedidos = cantPedidos;
    }

    public Integer getCantCamiones() {
        return cantCamiones;
    }

    public void setCantCamiones(Integer cantCamiones) {
        this.cantCamiones = cantCamiones;
    }
}
