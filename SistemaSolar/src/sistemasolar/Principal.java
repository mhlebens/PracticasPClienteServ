package sistemasolar;

public class Principal {

    public static void main(String[] args) {
        
        CuerpoCeleste planet [] = new CuerpoCeleste [4];
        planet [0] = new PlanetaGaseoso (95, "Júpiter", 69911, "778 millones de kilómetros", 780000000);
        planet [1] = new PlanetaGaseoso (146, "Saturno", 58232, "1418 millones de kilómetros", 1430000000);
        planet [2] = new PlanetaRocoso (0, "Mercurio", 2439.7, "46 millones de kilómetros", 46001200);
        planet [3] = new PlanetaRocoso (2, "Marte", 3389.5, "249 millones de kilómetros", 228000000);
    }
    
}
