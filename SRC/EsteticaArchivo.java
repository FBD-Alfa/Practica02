import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Clase que permite leer y escribir una Estetica sobre archivos tipo csv.
 * @author Jesús Alberto Reyes Gutiérrez
 * @version 21/03/2022
 */
public class EsteticaArchivo extends LeeryEscribir {
    
    /**
     * 
     */
    public EsteticaArchivo(){
        super("/home/alberto/UNAM/2022-2/Bases/Practica02/SRC/Estetica.csv");
    }

    /**
     * 
     * @param esteticas
     */
    public void escribeEstetica(ArrayList<Estetica> esteticas) {
        String lineaEstetica = "";
	    for (Estetica estetica : esteticas) {
		    lineaEstetica += estetica + "\n";
	    }
	    super.escribeArchivo(lineaEstetica);
    }

    /**
     * 
     * @return
     * @throws ArchivoNoEsxiste
     */
    public ArrayList<Estetica> leeEsteticas() throws FileNotFoundException {
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
     * 
     * @param estetica
     * @return
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
