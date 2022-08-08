package policiaMarcosPaz;

public class ArmaLarga extends Arma implements Comparable{
    private boolean tieneSelloRENAR;
    private String justificacionUso;
    private Integer nivelArma;

    public ArmaLarga(Integer cantMuniciones, double alcanceEnMetros, String marca, Integer calibre, String estado, boolean tieneSelloRENAR, String justificacionUso, Integer nivelArma) {
        super(cantMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.justificacionUso = justificacionUso;
        this.nivelArma = nivelArma;
    }

    @Override
    public String puedeSerUsadaParaEnfrentamiento(){
        if(getEstado() == "EN USO" && getCalibre() >= 9){
            return "Está en condiciones para ser usada";
        }
        return "No está en condiciones para ser usada";
    }

    @Override
    public int compareTo(Object object){
        ArmaLarga armaLarga = (ArmaLarga) object;
        if(this.nivelArma == armaLarga.getNivelArma()){
            return 0;
        }else if(this.nivelArma > armaLarga.getNivelArma()){
            return 1;
        }else{
            return 2;
        }
    };

    public boolean isTieneSelloRENAR() {
        return tieneSelloRENAR;
    }

    public void setTieneSelloRENAR(boolean tieneSelloRENAR) {
        this.tieneSelloRENAR = tieneSelloRENAR;
    }

    public String getJustificacionUso() {
        return justificacionUso;
    }

    public void setJustificacionUso(String justificacionUso) {
        this.justificacionUso = justificacionUso;
    }

    public Integer getNivelArma() {
        return nivelArma;
    }

    public void setNivelArma(Integer nivelArma) {
        this.nivelArma = nivelArma;
    }
}
