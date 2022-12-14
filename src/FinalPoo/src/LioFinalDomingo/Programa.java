package FinalPoo.src.LioFinalDomingo;

import java.util.ArrayList;

public class Programa extends OfertaAcademica{

    private Double bonificacion;
    ArrayList<OfertaAcademica> cursos;

    public Programa(String nombre, String descripcion,Double bonificacion ) {
        super(nombre, descripcion);
        this.bonificacion=bonificacion;
        this.cursos = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double valorTotal = 0.0;
        for (OfertaAcademica oa: this.cursos){
            valorTotal += oa.calcularPrecio();
        }
        return valorTotal*(1-this.bonificacion);
    }

    public void agregarCurso(OfertaAcademica oa){
        if (this.cursos == null){
            this.cursos = new ArrayList<>();
        }
        this.cursos.add(oa);
    }

}
