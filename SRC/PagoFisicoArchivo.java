import java.util.ArrayList;


public class PagoFisicoArchivo extends LeeryEscribir{
    /**
     * Constructor por omision que crea el archivo PagoFisico.csv
     */
    public PagoFisicoArchivo(){
      super("PagoFisico.csv");
    }

    /**
     * Metodo que prepara el arreglo de Pagos Fisicos para que puede ser guardado
     * @param po -- El arreglo de pago fisico
     */
    public void escribePagosFisicos(ArrayList<PagoFisico> pagoFisico) {
      String lineaPago = "";
      for (PagoFisico f : pagoFisico) {
        lineaPago += f + "\n";
      }
      super.escribeArchivo(lineaPago);
    }

    /**
     * Metodo que convierte un arreglo de String a un arreglo de pagos fisicos
     * @return pagos fisicos -- El arreglo de pagos fisicos
     * @throws ArchivoNoExiste -- Se lanza la excepción cuando el archivo no existe
     */
    public ArrayList<PagoFisico> leePagosFisicos() throws ArchivoNoExiste {
      String lineas[] = super.leeArchivo();
      ArrayList<PagoFisico> pagosFisicos = new ArrayList<>();
      for (int i = 0; i < lineas.length; i++) {
        if (!lineas[i].equals("null")) {
          pagosFisicos.add(parseaPagoFisico(lineas[i]));
        }
      }
      return pagosFisicos;
    }

    /**
     * Metodo que recibe una cadena y parsea los datos para crear a un Operador
     * @param cadenaOperador -- La cadena  parsear
     * @return el objeto con los datos de la cadena
     */
    private PagoFisico parseaPagoFisico(String cadenaPagoFisico) {
      String linea[] = cadenaPagoFisico.trim().split(",");
      String cliente = linea[0];
      String tipoDePago = linea[1];
      return new PagoFisico(cliente, tipoDePago);
      }
    }
