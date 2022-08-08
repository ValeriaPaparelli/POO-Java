package coleccionesPuerto;

public class Contenedor {
    private Integer numero;
    private String pais;
    private boolean materialPeligroso;

    public Contenedor(Integer numero, String pais, boolean materialPeligroso) {
        this.numero = numero;
        this.pais = pais;
        this.materialPeligroso = materialPeligroso;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isMaterialPeligroso() {
        return materialPeligroso;
    }

    public void setMaterialPeligroso(boolean materialPeligroso) {
        this.materialPeligroso = materialPeligroso;
    }


}
