package comboComposite;

public class FactoryProductos {

    private static FactoryProductos instancia;

    private FactoryProductos(){

    }

    public static FactoryProductos getInstance(){
        if(instancia == null){
            instancia = new FactoryProductos();
        }
        return instancia;
    }

    public Comprable crearProductoComprable(String nombreComprable){
        switch (nombreComprable){
            case "premium": //Tengo que crear primero los elementos y guardarlos adentro
                Sandwich sandwich = new Sandwich("doble queso", 12.5);
                Acompanamiento papas = new Acompanamiento("papas", 10.2, "grande");
                Acompanamiento bebida = new Acompanamiento("bebida", 8.75, "grande");
                ComboComposite premium = new ComboComposite("Premium");
                premium.addProducto(sandwich);
                premium.addProducto(papas);
                premium.addProducto(bebida);
                //Creo los objetos y los agrego adentro del combo, lo devuelvo (return)
                return premium;
            case "doble queso":
                Sandwich sandwich2 = new Sandwich("doble queso", 12.5);
                return sandwich2;
            case "coca":
                return new Acompanamiento("bebida", 20.0, "grande");
            default:
                return null;

        }
    }
}
