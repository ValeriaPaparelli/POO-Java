package empresaConstructora;

public class Piscina implements Construible{
    private String tipo;
    private Double cantlitros;
    private String forma;
    private boolean tieneIluminacion;

    private Double precioPorLitro;
    private Double precioIluminacion;

    public Piscina(String tipo, Double cantlitros, String forma, boolean tieneIluminacion, Double precioPorLitro) {
        this.tipo = tipo;
        this.cantlitros = cantlitros;
        this.forma = forma;
        this.tieneIluminacion = tieneIluminacion;
        this.precioPorLitro = precioPorLitro;
        this.precioIluminacion = 30000.00;
    }

    @Override
    public Double getPrecio(){
        Double precio = this.cantlitros * this.precioPorLitro;
        if(this.tieneIluminacion){
            precio += this.precioIluminacion;
        }
        return precio;
    }

    @Override
    public String getDetalle(){
        return "Piscina " + this.tipo + " " + this.cantlitros + " litros, precio $" + this.getPrecio() + " dolares.";
    }
}

