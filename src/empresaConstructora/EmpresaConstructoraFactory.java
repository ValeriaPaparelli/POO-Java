package empresaConstructora;

public class EmpresaConstructoraFactory {
    private static EmpresaConstructoraFactory instance;

    private EmpresaConstructoraFactory(){

    }

    public static EmpresaConstructoraFactory getInstance(){
        if(instance == null){
            instance = new EmpresaConstructoraFactory();
        }
        return instance;
    }

    public Construible construirConstruccion(String construccion){
        switch (construccion){
            case "Chalet Pareado":
                Casa chalet = new Casa("chalet Pareado", 200.00, 1500.0, 6 );
                return chalet;
            case "Hormigon":
                Piscina hormigon = new Piscina("Hormigon", 40000.00, "cuadrada", false, 1.10);
                return hormigon;
            case "Home Sweet Home":
                Casa aislada = new Casa("aislada", 420.00, 3200.00, 0);
                Piscina desbordante = new Piscina("desbordante", 60000.00, "cuadrada", true, 2.10);
                CompositeViviendaPremium viviendaPremium = new CompositeViviendaPremium("Home Sweet Home", 5);
                viviendaPremium.addConstruccion(aislada);
                viviendaPremium.addConstruccion(desbordante);
                return viviendaPremium;
            default:
                return null;
        }
    }
}


