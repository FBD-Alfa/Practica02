import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Clase que permite leer y escribir una Estetica sobre archivos tipo csv.
 * @author Jesús Alberto Reyes Gutiérrez
 * @version 21/03/2022
 */
public class EsteticaArchivo extends LeeryEscribir {

    /**
     * Constructor por omisión. Crea el File Estetica.csv.
     */
    public EsteticaArchivo(){
        super("Estetica.csv");
    }

    /**
     * Escribe una lista de Estéticas en un archivo csv.
     * @param esteticas -- Lista de Estéticas que serán escritas.
     */
    public void escribeEstetica(ArrayList<Estetica> esteticas) {
        String lineaEstetica = "";
	    for (Estetica estetica : esteticas) {
		    lineaEstetica += estetica + "\n";
	    }
	    super.escribeArchivo(lineaEstetica);
    }

    /**
     * Lee una lista de Estéticas de un archivo csv.
     * @return -- La lista de Estéticas del archivo.
     * @throws FileNotFoundException -- Cuando no encuentra el archivo Estetica.csv.
     */
    public ArrayList<Estetica> leeEsteticas() throws ArchivoNoExiste {
        String[] lineas = super.leeArchivo();
        ArrayList<Estetica> esteticas = new ArrayList<>();
        for (int i = 0; i < lineas.length; i++) {
            if (!lineas[i].equals("null")) {
                esteticas.add(parseaEstetica(lineas[i]));
            }
        }
	    return esteticas;
    }

    /**
     * Método auxiliar que convierte una línea con atributos en una Estética.
     * @param estetica -- Cadena con los atributos de la estética separados por comas.
     * @return -- Estética correspondiente a los atributos de la cadena.
     */
    private static Estetica parseaEstetica(String estetica) {
        String[] linea = estetica.trim().split(",");
        int clave = Integer.parseInt(linea[0]);
        String nombre = linea[1];
        String estado = linea[2];
        String calle = linea[3];
        String cp = linea[4];
        String numDir = linea[5];
        long numero = Long.parseLong(linea[6]);
        String horario = linea[7];
        short numConsult = Short.parseShort(linea[8]);
        Direccion direccion = new Direccion(estado, calle, cp, numDir);
        return new Estetica(clave, nombre, direccion, numero, horario, numConsult);
    }
}
