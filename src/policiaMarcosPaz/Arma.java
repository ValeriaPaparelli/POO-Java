package policiaMarcosPaz;

public abstract class Arma {
    private Integer cantMuniciones;
    private double alcanceEnMetros;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Integer cantMuniciones, double alcanceEnMetros, String marca, Integer calibre, String estado) {
        this.cantMuniciones = cantMuniciones;
        this.alcanceEnMetros = alcanceEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public abstract String puedeSerUsadaParaEnfrentamiento();

    public Integer getCantMuniciones() {
        return cantMuniciones;
    }

    public void setCantMuniciones(Integer cantMuniciones) {
        this.cantMuniciones = cantMuniciones;
    }

    public double getAlcanceEnMetros() {
        return alcanceEnMetros;
    }

    public void setAlcanceEnMetros(double alcanceEnMetros) {
        this.alcanceEnMetros = alcanceEnMetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCalibre() {
        return calibre;
    }

    public void setCalibre(Integer calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
