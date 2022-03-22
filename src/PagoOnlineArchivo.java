import java.util.ArrayList;


public class PagoOnlineArchivo extends LeeryEscribir{
    /**
     * Constructor por omision que crea el archivo PagoOnline.csv
     */
    public PagoOnlineArchivo(){
      super("Pago.csv");
    }

    /**
     * Metodo que prepara el arreglo de Pagos Online para que puede ser guardado
     * @param po -- El arreglo de pago online
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
     * Metodo que recibe una cadena y parsea los datos para crear a un Operador
     * @param cadenaOperador -- La cadena  parsear
     * @return el objeto con los datos de la cadena
     */
    private PagoOnline parseaPagoOnline(String cadenaPagoOnline) {
      String linea[] = cadenaPagoOnline.trim().split(",");
      String noTargetaCadena = linea[0];
      String vencimiento = linea[1];
      String titular = linea[2];
      int noTargeta = 0;
      try{
            noTargeta = Integer.parseInt(noTargetaCadena);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
      return new PagoOnline(noTargeta, vencimiento, titular);
      }
    }
