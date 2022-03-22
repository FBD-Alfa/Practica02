
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {
  private static ArrayList<PagoOnline> pagosOnline = new ArrayList<>();
  private static PagoOnlineArchivo archivo = new PagoOnlineArchivo();
  /* Variable entrada, permite la interacción con el usuario. */
  private static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Cargando datos de Pagos Online...");
      try{
        pagosOnline = archivo.leePagosOnline();
        System.out.println("Listo...");
      }catch(Exception e){
        System.out.println(e);
      }
      despliegaMenuPrincipal();
    }

    public static void despliegaMenuPrincipal(){
      System.out.println("Ingresa la opción deseada\n" +
                         "1-Agregar Operador\n" +
                         "2-Ver Operadores\n"+
                         "3-Editar Operador\n" +
                         "4-Borrar Operador\n" +
                         "5-Salir\n");
                         String eleccion = entrada.nextLine();
      switch (eleccion) {
        case "1" :
        despliegaCreaPagoOnline();
        break;
        case "2" :
        for(int i=0;i<pagosOnline.size();i++){
            System.out.println(pagosOnline.get(i).toString());
        }
        break;
        case "3" :
        case "4" :
        case "5" :
        System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
        System.exit(0);
        default :
        System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
        despliegaMenuPrincipal();
      }
    }

      public static void despliegaCreaPagoOnline(){
        int noTargeta = 0;
        System.out.println("Ingresa el número de la targeta.");
        String noTargetaCadena = entrada.nextLine();
        try{
              noTargeta = Integer.parseInt(noTargetaCadena);
          }
          catch (NumberFormatException ex){
              ex.printStackTrace();
          }
        System.out.println("Ingresa el vencimiento de la targeta.");
        String vencimiento = entrada.nextLine();
        System.out.println("Ingresa el nombre del titular.");
        String titular= entrada.nextLine();
        PagoOnline nuevo = new PagoOnline(noTargeta, vencimiento, titular);
        pagosOnline.add(nuevo);
        archivo.escribePagosOnline(pagosOnline);
      }
    }
