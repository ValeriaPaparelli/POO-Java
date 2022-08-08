package empresaConstructora;

public class Test {
    public static void main(String[] args) {

        EmpresaConstructora empresa = new EmpresaConstructora("Los hermanos");

        EmpresaConstructoraFactory fabrica = EmpresaConstructoraFactory.getInstance();

        Construible casa = fabrica.construirConstruccion("Chalet Pareado");
        empresa.agregarConstruccion(casa);

        Construible piscina = fabrica.construirConstruccion("Hormigon");
        empresa.agregarConstruccion(piscina);

        Construible viviendaPremium = fabrica.construirConstruccion("Home Sweet Home");
        empresa.agregarConstruccion(viviendaPremium);

        empresa.generarInforme();

    }
}

