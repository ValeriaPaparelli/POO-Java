package supermercado;

public abstract class Caja {

    private Integer cantDinero;
    private Integer cantTickkets;
    private boolean aceptaTarjeta;
    private Persona persona;

    public Caja(Integer cantDinero, Integer cantTickkets, boolean aceptaTarjeta, Persona persona) {
        this.cantDinero = cantDinero;
        this.cantTickkets = cantTickkets;
        this.aceptaTarjeta = aceptaTarjeta;
        this.persona = persona;
    }

    public abstract String poderRetirarTickets();

    public Integer getCantDinero() {
        return cantDinero;
    }

    public void setCantDinero(Integer cantDinero) {
        this.cantDinero = cantDinero;
    }

    public Integer getCantTickkets() {
        return cantTickkets;
    }

    public void setCantTickkets(Integer cantTickkets) {
        this.cantTickkets = cantTickkets;
    }

    public boolean isAceptaTarjeta() {
        return aceptaTarjeta;
    }

    public void setAceptaTarjeta(boolean aceptaTarjeta) {
        this.aceptaTarjeta = aceptaTarjeta;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
