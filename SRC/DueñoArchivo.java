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
        super("Dueño.csv");
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
     * @param duenio
     * @return
     */
    private Dueño parseaDueño(String duenio) {
        String[] linea = duenio.trim().split(",");
        String CURP  = linea[0];
        String nombre = linea[1];
        String ApellidoP = linea[1];
        String ApellidoM = linea[1];
        String estado = linea[2];
        String calle = linea[3];
        String cp = linea[4];
        String numDir = linea[5];
        long numero = Long.parseLong(linea[6]);
        long telefono = Long.parseLong(linea[7]);
        String fecha = linea[8];
        String email  = linea[9];
        Direccion direccion = new Direccion(estado, calle, cp, numDir);
        return new Dueño(CURP, nombre, ApellidoP, ApellidoM, direccion,telefono,fecha,email);
    }
}
