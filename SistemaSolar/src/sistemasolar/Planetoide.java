package sistemasolar;

//esta clase hereda de cuerpo celeste y utiliza polimorfismo por medio de la interfaz planeta
public abstract class Planetoide extends CuerpoCeleste implements Planeta {

    //Atributo especifico de los planetas
    private int numLunas;
    
//constructor de la clase planetoide
    public Planetoide(int numLunas, String nombre, double tamano, String orbita, double distanciaSol) {
        super(nombre, tamano, orbita, distanciaSol);
        this.numLunas = numLunas;
    }

    public int getNumLunas() {
        return numLunas;
    }

    public void setNumLunas(int numLunas) {
        this.numLunas = numLunas;
    }

    // Método para calcular el año orbital (en base a la 3ra Ley de Kepler)
    @Override
    public double calcularAños() {
        return Math.sqrt(Math.pow(getDistanciaSol(), 3));
    }

    // Representa en forma de cadena el objeto, mostrando sus atributos principales
    @Override
    public String toString() {
        return super.toString() 
                + "\n Cantidad de lunas: " + this.getNumLunas() 
                + "\n Año orbital: " + this.calcularAños();
    }

}
