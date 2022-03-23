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
    public void escribeEstetica(ArrayList<Dueño> duenios) {
        String lineaDuenio = "";
	    for (Dueño duenio: duenios) {
		    lineaDuenio += duenios + "\n";
	    }
	    super.escribeArchivo(lineaDuenio);
    }

    /**
     * 
     * @return
     * @throws ArchivoNoEsxiste
     */
    public ArrayList<Dueño> leeEsteticas() throws ArchivoNoEsxiste {
        String[] lineas = super.leeArchivo();
        ArrayList<Operador> operadores = new ArrayList<>();
        for (int i = 0; i < lineas.length; i++) {
            if (!lineas[i].equals("null")) {
                operadores.add(parseaOperador(lineas[i]));
            }
        }
	    return operadores;
    }

    /**
     * FALTA IMPLEMENTAR
     * @param duenio
     * @return
     */
    private Dueño parseaEstetica(String duenio) {
        return null;
    }
}
