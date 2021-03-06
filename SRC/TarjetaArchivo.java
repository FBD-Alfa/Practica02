import java.util.ArrayList;

/**
 * Clase que permite leer y escribir una tarjeta sobre archivos tipo csv.
 * @author Sánchez Urbano Cynthia Lizbeth
 * @version 21/03/2022
 */

public class TarjetaArchivo extends LeeryEscribir{
    /**
     * Constructor por omision que crea el archivo Tarjeta.csv
     */
    public TarjetaArchivo(){
      super("Tarjeta.csv");
    }

    /**
     * Metodo que prepara el arreglo de Tarjetas para que puede ser guardado.
     * @param tarjetas -- El arreglo de tarjetas.
     */
    public void escribeTarjetas(ArrayList<Tarjeta> tarjetas) {
      String lineaPago = "";
      for (Tarjeta t : tarjetas) {
        lineaPago += t + "\n";
      }
      super.escribeArchivo(lineaPago);
    }

    /**
     * Metodo que convierte un arreglo de String a un arreglo de Tarjetas
     * @return tarjetas -- El arreglo de tarjetas
     * @throws ArchivoNoExiste -- Se lanza la excepción cuando el archivo no existe
     */
    public ArrayList<Tarjeta> leeTarjetas() throws ArchivoNoExiste {
      String lineas[] = super.leeArchivo();
      ArrayList<Tarjeta> tarjetas = new ArrayList<>();
      for (int i = 0; i < lineas.length; i++) {
        if (!lineas[i].equals("null")) {
          tarjetas.add(parseaTarjeta(lineas[i]));
        }
      }
      return tarjetas;
    }

    /**
     * Metodo que recibe una cadena y parsea los datos para crear una tarjeta.
     * @param cadenaTarjeta -- La cadena  parsear
     * @return la tarjeta con los datos de la cadena
     */
    private Tarjeta parseaTarjeta(String cadenaTarjeta) {
      String linea[] = cadenaTarjeta.trim().split(",");
      String numeroCadena = linea[0];
      String titular = linea[1];
      String cvvCadena = linea[2];
      String vencimiento = linea[3];
      int numero = 0;
      int cvv = 0;
      try{
            numero = Integer.parseInt(numeroCadena);
            cvv = Integer.parseInt(cvvCadena);
        }
        catch (NumberFormatException ex){
            System.out.println("Ese número no es valido");
        }
      return new Tarjeta(numero, titular, cvv, vencimiento);
      }
    }
