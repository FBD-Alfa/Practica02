
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
      System.out.println("\n[ Ingresa la opción deseada ]\n" +
                         "1-Agregar Pago Online\n" +
                         "2-Ver Pago Online\n"+
                         "3-Editar Pago Online\n" +
                         "4-Borrar Pago Online\n" +
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
        despliegaMenuPrincipal();
        break;
        case "3" :
        despliegaEditaPagoOnline();
        break;
        case "4" :
        despliegaBorraPagoOnline();
        break;
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
        despliegaMenuPrincipal();
      }

      private static PagoOnline buscaPago(String noTargetaCadena){
        int noTargeta = 0;
        try{
              noTargeta = Integer.parseInt(noTargetaCadena);
          }
          catch (NumberFormatException ex){
              System.out.println("Ocurrio un error, puede que su número de targeta sea invalido");
          }
        for (PagoOnline pago : pagosOnline){
          if (pago.getNoTargeta() == noTargeta){
            return pago;
          }
        }
        System.out.println("No hay conincidencias");
        return null;
      }

      public static void despliegaEditaPagoOnline(){
        System.out.println("Escriba el número de targeta del pago que quiere editar.");
        PagoOnline pago = buscaPago(entrada.nextLine());
        if (pago != null){
          edita(pago);
        }
        despliegaMenuPrincipal();
      }

      public static void despliegaBorraPagoOnline(){
        System.out.println("Escriba el número de targeta del pago que quiere borrar.");
        PagoOnline pago = buscaPago(entrada.nextLine());
        if (pago != null){
          pagosOnline.remove(pago);
          archivo.escribePagosOnline(pagosOnline);
          System.out.println("El pago se borro exitosamente.");
        }else{
          System.out.println("No se pudo eliminar el pago");
          despliegaMenuPrincipal();
          return;
        }
        despliegaMenuPrincipal();
      }

      private static void edita(PagoOnline pago){
        System.out.println("\n[ ¿Que campo desea editar? ]\n"+
                           "1- Número de Targeta\n"+
                           "2- Vencimiento\n"+
                           "3- Titular\n"+
                           "4- Regresar al menu anterior\n");
                          String eleccion = entrada.nextLine();
        switch (eleccion) {
          case "1" :
          cambiaNoTargeta(pago);
          break;
          case "2" :
          cambiaVencimiento(pago);
          break;
          case "3" :
          cambiaTitular(pago);
          break;
          case "4" :
          despliegaMenuPrincipal();
          break;
          default:
          System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
          edita(pago);
      }
    }

    private static void cambiaNoTargeta(PagoOnline pago){
      int noTargeta = 0;
      System.out.println("Escriba el nuevo número de targeta.");
      String noTargetaCadena = entrada.nextLine();
      try{
          noTargeta = Integer.parseInt(noTargetaCadena);
        }
        catch (NumberFormatException ex){
          System.out.println("Ocurrio un error, puede que su número de targeta sea invalido");
          edita(pago);
          return;
        }
      pago.setNoTargeta(noTargeta);
      archivo.escribePagosOnline(pagosOnline);
    }

    private static void cambiaVencimiento(PagoOnline pago){
      System.out.println("Escriba el nuevo vencimiento.");
      String vencimiento = entrada.nextLine();
      pago.setVencimiento(vencimiento);
      archivo.escribePagosOnline(pagosOnline);
    }

    private static void cambiaTitular(PagoOnline pago){
      System.out.println("Escriba el nuevo titular.");
      String titular = entrada.nextLine();
      pago.setTitular(titular);
      archivo.escribePagosOnline(pagosOnline);
    }
  }
