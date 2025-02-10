package sistemasolar;

public class PlanetaRocoso extends Planetoide {

    public PlanetaRocoso(int numLunas, String nombre, double tamano, String orbita, double distanciaSol) {
        super(numLunas, nombre, tamano, orbita, distanciaSol);
    }
    
    // Calcula el tiempo que tarda el planeta en dar una vuelta alrededor del Sol (año orbital)
    @Override
    public double calcularAños() {
        return Math.sqrt(Math.pow(getDistanciaSol(), 3));
    }
        
    // Calcula la gravedad del planeta basada en su tamaño (factor de ajuste para planetas rocosos)
    @Override
    public double getGravedad() {
        return (getTamano() * 9.8) / 6371;
    }

    // Representa en forma de cadena el objeto, mostrando sus atributos principales
    @Override
    public String toString(){
        return "Planeta rocoso: " + super.toString();
    }   
}
