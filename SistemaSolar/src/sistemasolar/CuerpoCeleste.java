package sistemasolar;


public abstract class CuerpoCeleste {
   private String orbita="";
    private double gravedad=0;
    private String nombre="";
    private double tamano=0;
    private double distanciaSol=0;
    private int numLuna=0;

    public CuerpoCeleste(String nombre) {
        this.nombre=nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getGravedad();
    
    public abstract double getDistanciaSol();

  
    
    
}
