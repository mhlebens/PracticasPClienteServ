package sistemasolar;


public abstract class CuerpoCeleste {
   private String orbita="";
    private double gravedad=0;
    private String tipo="";
    private double tamano=0;
    private double distanciaSol=0;
 

    public CuerpoCeleste(String nombre) {
        this.tipo=tipo;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String tipo) {
        this.tipo = tipo;
    }

    public abstract double getGravedad();
    
    public abstract double getDistanciaSol();

  
    
    
}
