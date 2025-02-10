package sistemasolar;

//declaracion de atributos
public abstract class CuerpoCeleste {
    
   private String orbita="";
    private double gravedad=0;
    private String tipo="";
    private double tamano=0;
    private double distanciaSol=0;
 

    //constructor de la clase abstracta Cuerpo Celeste
    public CuerpoCeleste(String nombre, double tamano, String orbita, double distanciaSol) {
        this.tipo=tipo;
        this.tamano=tamano;
        this.orbita=orbita;
        this.distanciaSol=distanciaSol;
    }

    //setter y getters
    public String getTipo() {
        return tipo;
    }

    public void setNombre(String tipo) {
        this.tipo = tipo;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    
    //metodo del calculo de la gravedad
    public abstract double getGravedad();

    
    //to string de la clase cuepro celeste
    @Override
    public String toString() {
        return    "\nOrbita=" + this.getOrbita() 
                + "\nTipo=" + this.getTipo() 
                + "\nTamano=" + this.getTamano() 
                + "\nDistanciaSol=" + this.getDistanciaSol() 
                + "\nGravedad=" + this.getGravedad();
    }
    


  
    
    
}
