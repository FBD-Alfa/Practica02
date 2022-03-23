import java.util.ArrayList;
/**
 * Clase que permite leer y escribir una Estetica sobre archivos tipo csv.
 * @author Castro Romero Ares Gael
 * @version 21/03/2022
 */
public class DueñoArchivo extends LeeryEscribir {

    /**
     *
     */
    public DueñoArchivo(){
        super("Duenio.csv");
    }

    /**
     *
     * @param duenios
     */
    public void escribeDueño(ArrayList<Dueño> duenios) {
        String lineaDuenio = "";
	    for (Dueño duenio: duenios) {
		    lineaDuenio += duenios + "\n";
	    }
	    super.escribeArchivo(lineaDuenio);
    }

    /**
     *
     * @return
     * @throws ArchivoNoExiste
     */
    public ArrayList<Dueño> leeDueños() throws ArchivoNoExiste {
        String[] lineas = super.leeArchivo();
        ArrayList<Dueño> dueños = new ArrayList<>();
        for (int i = 0; i < lineas.length; i++) {
            if (!lineas[i].equals("null")) {
                dueños.add(parseaDueño(lineas[i]));
            }
        }
	    return dueños;
    }

    /**
     * FALTA IMPLEMENTAR
     * @param duenio
     * @return
     */
    private Dueño parseaDueño(String duenio) {
        return null;
    }
}
