package FinalPoo.src.LioFinalDomingo;

import java.util.concurrent.Callable;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;
    private OfertaAcademicaFactory(){

    }
    public static OfertaAcademicaFactory getInstance(){
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica crearOfertaAcedemica(String ofertaAcademica){
        switch (ofertaAcademica){
            case "backend":
                return new Curso(20.0,2,900.0,"backend","");
            case "frontend":
                return new Curso(16.0,2,1000.0,"frontend","");
            case "fullstack":
                Curso backend = new Curso(20.0,2,900.0,"backend","");
                Curso frontend = new Curso(16.0,2,1000.0,"frontend","");
                Programa fullstack = new Programa("fullstack","",1.0);
                fullstack.agregarCurso(backend);
                fullstack.agregarCurso(frontend);
            return fullstack;
            default:
                return null;
        }
    }

}
