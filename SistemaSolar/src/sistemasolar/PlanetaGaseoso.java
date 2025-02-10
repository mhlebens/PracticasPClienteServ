package sistemasolar;

//Esta clase hereda de planetoide
public class PlanetaGaseoso extends Planetoide {

    //constructor de la clase PlanetaGaseoso
    public PlanetaGaseoso(int numLunas, String nombre, double tamano, String orbita, double distanciaSol) {
        super(numLunas, nombre, tamano, orbita, distanciaSol);
    }   
    
    // Calcula el tiempo que tarda el planeta en dar una vuelta alrededor del Sol
    @Override
    public double calcularAños() {
        return Math.sqrt(Math.pow(getDistanciaSol(), 3));
    }
        
    // Calcula la gravedad del planeta basada en su tamaño (factor de ajuste para planetas rocosos)
    @Override
    public double getGravedad() {
        return (getTamano() * 24.79) / 69911;
    }

    // Representa en forma de cadena el objeto, mostrando sus atributos principales
    @Override
    public String toString(){
        return "Planeta gaseoso: " + super.toString();
    }   
}
