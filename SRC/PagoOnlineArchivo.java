import java.util.ArrayList;

/**
 * Clase que permite leer y escribir un pago online sobre archivos tipo csv.
 * @author Sánchez Urbano Cynthia Lizbeth
 * @version 21/03/2022
 */
public class PagoOnlineArchivo extends LeeryEscribir{
    /**
     * Constructor por omision que crea el archivo PagoOnline.csv
     */
    public PagoOnlineArchivo(){
      super("PagoOnline.csv");
    }

    /**
     * Metodo que prepara el arreglo de Pagos Online para que puede ser guardado
     * @param pagoOnline -- El arreglo de pago online
     */
    public void escribePagosOnline(ArrayList<PagoOnline> pagoOnline) {
      String lineaPago = "";
      for (PagoOnline o : pagoOnline) {
        lineaPago += o + "\n";
      }
      super.escribeArchivo(lineaPago);
    }

    /**
     * Metodo que convierte un arreglo de String a un arreglo de Pago Online
     * @return pagos online -- El arreglo de pago online
     * @throws ArchivoNoExiste -- Se lanza la excepción cuando el archivo no existe
     */
    public ArrayList<PagoOnline> leePagosOnline() throws ArchivoNoExiste {
      String lineas[] = super.leeArchivo();
      ArrayList<PagoOnline> pagosOnline = new ArrayList<>();
      for (int i = 0; i < lineas.length; i++) {
        if (!lineas[i].equals("null")) {
          pagosOnline.add(parseaPagoOnline(lineas[i]));
        }
      }
      return pagosOnline;
    }

    /**
     * Metodo que recibe una cadena y parsea los datos para crear a un PagoOnline
     * @param cadenaPagoOnline -- La cadena  parsear
     * @return el PagoOnline con los datos de la cadena
     */
    private PagoOnline parseaPagoOnline(String cadenaPagoOnline) {
      String linea[] = cadenaPagoOnline.trim().split(",");
      String numeroCadena = linea[0];
      String titular = linea[1];
      String cvvCadena = linea[2];
      String vencimiento = linea[3];
      String cantidadCadena = linea[4];
      int numero = 0;
      int cvv = 0;
      int cantidad = 0;
      try{
            numero = Integer.parseInt(numeroCadena);
            cvv = Integer.parseInt(cvvCadena);
            cantidad = Integer.parseInt(cantidadCadena);

        }
        catch (NumberFormatException ex){
            System.out.println("Alguno de los números ingresados no es valido");
        }
      return new PagoOnline(numero,titular,cvv,vencimiento,cantidad);
      }
    }
