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
        super("Estetica.csv");
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
    public ArrayList<Estetica> leeEsteticas() throws ArchivoNoEsxiste {
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
     * @param estetica
     * @return
     */
    private Estetica parseaEstetica(String estetica) {
        return null;
    }
}
