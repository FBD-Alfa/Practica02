import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Clase que permite leer y escribir una Mascota sobre archivos tipo csv.
 * @author Aguirre Chavez Alejandra
 * @version 21/03/2022
 */
public class MascotaArchivo extends LeeryEscribir {

    /**
     * Constructor por omisión. Crea el File Estetica.csv.
     */
    public MascotaArchivo(){
        super("Mascota.csv");
    }

    /**
     * Escribe una lista de Estéticas en un archivo csv.
     * @param esteticas -- Lista de Estéticas que serán escritas.
     */
    public void escribeMascota(ArrayList<Mascota> mascotas) {
        String lineaMascota = "";
	    for (Mascota mascota : mascotas) {
		    lineaMascota += mascota + "\n";
	    }
	    super.escribeArchivo(lineaMascota);
    }

    /**
     * Lee una lista de Mascotas de un archivo csv.
     * @return -- La lista de Mascotas del archivo.
     * @throws FileNotFoundException -- Cuando no encuentra el archivo Mascota.csv.
     */
    public ArrayList<Mascota> leeMascotas() throws ArchivoNoExiste {
        String[] lineas = super.leeArchivo();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        for (int i = 0; i < lineas.length; i++) {
            if (!lineas[i].equals("null")) {
                mascotas.add(parseaMascota(lineas[i]));
            }
        }
	    return mascotas;
    }

    /**
     * Método auxiliar que convierte una línea con atributos en una Mascota.
     * @param mascota -- Cadena con los atributos de la estética separados por comas.
     * @return -- Mascota correspondiente a los atributos de la cadena.
     */
    private static Mascota parseaMascota(String mascota) {
        String[] linea = mascota.trim().split(",");
        int clave = Integer.parseInt(linea[0]);
        String duenio = linea[1];
        String nombre = linea[2];
        int anio = Integer.parseInt(linea[3]);
        String mes = linea[4];
        int dia = Integer.parseInt(linea[5]);
        float peso =  Float.parseFloat(linea[6]);
        String especie = linea[7];
        String raza = linea[8];
        FechaNac fechanac = new FechaNac(dia, mes, anio);
        return new Mascota(clave, duenio, nombre, fechanac, peso, especie, raza);
    }
}
