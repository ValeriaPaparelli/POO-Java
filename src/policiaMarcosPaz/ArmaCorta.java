package policiaMarcosPaz;

public class ArmaCorta extends Arma{
    private boolean esAutomatica;

    public ArmaCorta(Integer cantMuniciones, double alcanceEnMetros, String marca, Integer calibre, String estado, boolean esAutomatica) {
        super(cantMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    @Override
    public String puedeSerUsadaParaEnfrentamiento(){
        if(getEstado() == "EN USO" && getCalibre() >= 9){
            return "Está en condiciones para ser usada";
        }
            return "No está en condiciones para ser usada";
    }

    public String puedeDispararMasDe200ml(){
        if(getAlcanceEnMetros() < 200.00){
            return "Puede disparar a màs de 200 metros";
        }
            return "No puede disparar a más de 200metros";
    }

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
