import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Clase MenuPagoOnline, maneja los menus de los pagos online.
 * @author Sánchez Urbano Cynthia
 * @version 21/03/2022
 */
public class MenuPagoOnline {
  private ArrayList<PagoOnline> pagosOnline = new ArrayList<>();
  private PagoOnlineArchivo archivo = new PagoOnlineArchivo();
  private Scanner entrada = new Scanner(System.in);
  private Menu menu;

    /**
     * Método MenuPagoOnline, maneja los menus de los pagos en línea.
     * @param menu, el menu principal.
     */
    public MenuPagoOnline(Menu menu) {
      System.out.println("Cargando datos de Pagos Online...");
      try{
        pagosOnline = archivo.leePagosOnline();
        System.out.println("Listo...");
      }catch(Exception e){
        System.out.println(e);
      }
      despliegaMenuPrincipal();
    }

   /**
    * Método despliegaMenuPrincipal, despliega las opciones principales
    * de los pagos online para la interacción con el usuario.
    */
    public void despliegaMenuPrincipal(){
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

  /**
   * Método despliegaCreaPagoOnline, despliega un menu para crear
   * un nuevo Pago Online.
   */
      public void despliegaCreaPagoOnline(){
        long numero = 0;
        int cvv = 0;
        int cantidad = 0;
        System.out.println("Ingresa el número de la tarjeta.");
        String numeroCadena = entrada.nextLine();
        try{
              numero = Long.parseLong(numeroCadena);
          }
          catch (NumberFormatException ex){
                System.out.println("El número de la tarjeta no es valido");
                despliegaMenuPrincipal();
                return;
          }
        System.out.println("Ingresa el nombre del titular.");
        String titular = entrada.nextLine();
        if (titular.isEmpty()) {
          System.out.println("No ingresaste un nombre.");
          despliegaMenuPrincipal();
          return;
        }
        System.out.println("Ingresa el cvv de la tarjeta");
        String cvvCadena = entrada.nextLine();
        try{
              cvv = Integer.parseInt(cvvCadena);
          }
          catch (NumberFormatException ex){
              System.out.println("El cvv no es valido");
              despliegaMenuPrincipal();
              return;
          }
        System.out.println("Ingresa el vencimiento de la tarjeta.");
        String vencimiento = entrada.nextLine();
        if (vencimiento.isEmpty()) {
          System.out.println("No ingresaste una fecha de vencimiento.");
          despliegaMenuPrincipal();
          return;
        }
        System.out.println("Ingresa la cantidad a pagar.");
        String cantidadCadena = entrada.nextLine();
        try{
              cantidad = Integer.parseInt(cantidadCadena);
          }
          catch (NumberFormatException ex){
              System.out.println("La cantidad no es valida");
              despliegaMenuPrincipal();
              return;
          }
        PagoOnline nuevo = new PagoOnline(numero,titular,cvv,vencimiento,cantidad);
        pagosOnline.add(nuevo);
        archivo.escribePagosOnline(pagosOnline);
        despliegaMenuPrincipal();
      }

    /**
     * Método auxiliar buscaPago, busca un pago por el número de tarjeta.
     * @param numeroCadena, la representación en cadena del número de la tarjeta.
     * @return PagoOnline, el pago online si existe un pago con ese número de
     * tarjeta, regresa null si no hay ningún pago con ese número de tarjeta.
     */
     private PagoOnline buscaPago(String numeroCadena){
        int numero = 0;
        try{
              numero = Integer.parseInt(numeroCadena);
          }
          catch (NumberFormatException ex){
              System.out.println("Ocurrio un error, puede que su número de tarjeta sea invalido");
          }
        for (PagoOnline pago : pagosOnline){
          if (pago.getTarjeta().getNumero() == numero){
            return pago;
          }
        }
        System.out.println("No hay conincidencias");
        return null;
      }

      public void despliegaEditaPagoOnline(){
        System.out.println("Escriba el número de tarjeta del pago que quiere editar.");
        PagoOnline pago = buscaPago(entrada.nextLine());
        if (pago != null){
          edita(pago);
        }
        despliegaMenuPrincipal();
      }

    /**
     * Método despliegaBorraPagoOnline, despliega un menu para borrar un pago.
     * busca el pago a eliminar por el número de tarjeta.
     */
     public void despliegaBorraPagoOnline(){
        System.out.println("Escriba el número de tarjeta del pago que quiere borrar.");
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

    /**
     * Método edita, despliega un menu para editar un pago.
     * @param pago, el pago a editar.
     */
     public void edita(PagoOnline pago){
        System.out.println("\n[ ¿Que campo desea editar? ]\n"+
                           "1- Número de Tarjeta\n"+
                           "2- Titular\n"+
                           "3- CVV\n"+
                           "4- Vencimiento\n"+
                           "5- Cantidad\n"+
                           "6- Regresar al menu anterior\n");
                          String eleccion = entrada.nextLine();
        switch (eleccion) {
          case "1" :
          cambiaNoTarjeta(pago);
          break;
          case "2" :
          cambiaTitular(pago);
          break;
          case "3" :
          cambiaCVV(pago);
          break;
          case "4" :
          cambiaVencimiento(pago);
          break;
          case "5" :
          cambiaCantidad(pago);
          break;
          case "6" :
          despliegaMenuPrincipal();
          break;
          default:
          System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
          edita(pago);
      }
    }

    /**
     * Método auxiliar cambiaNoTarjeta, cambia el número de la tarjeta.
     * @param pago, el pago al cual se le cambiara el número de la tarjeta.
     */
     private void cambiaNoTarjeta(PagoOnline pago){
      long numero = 0;
      System.out.println("Escriba el nuevo número de tarjeta.");
      String numeroCadena = entrada.nextLine();
      try{
          numero = Long.parseLong(numeroCadena);
        }
        catch (NumberFormatException ex){
          System.out.println("Ocurrio un error, puede que su número de tarjeta sea invalido");
          edita(pago);
          return;
        }
      pago.getTarjeta().setNumero(numero);
      System.out.println("El número de la tarjeta fue cambiado exitosamente.");
      archivo.escribePagosOnline(pagosOnline);
    }

    /**
     * Método auxiliar cambiaVencimiento, cambia el vencimiento de la tarjeta.
     * @param pago, el pago al cual se le cambiara el vencimiento de la tarjeta.
     */
     private void cambiaVencimiento(PagoOnline pago){
      System.out.println("Escriba el nuevo vencimiento.");
      String vencimiento = entrada.nextLine();
      pago.getTarjeta().setVencimiento(vencimiento);
      System.out.println("El vencimiento fue cambiado exitosamente.");
      archivo.escribePagosOnline(pagosOnline);
    }

    /**
     * Método auxiliar cambiaTitular, cambia el titular de la tarjeta.
     * @param pago, el pago al cual se le cambiara el titular de la tarjeta.
     */
     private void cambiaTitular(PagoOnline pago){
      System.out.println("Escriba el nuevo titular.");
      String titular = entrada.nextLine();
      pago.getTarjeta().setTitular(titular);
      System.out.println("El titular fue cambiado exitosamente.");
      archivo.escribePagosOnline(pagosOnline);
    }

    /**
     * Método auxiliar cambiaCVV, cambia el cvv de la tarjeta.
     * @param pago, el pago al cual se le cambiara el cvv de la tarjeta.
     */
     private void cambiaCVV(PagoOnline pago){
      int cvv = 0;
      System.out.println("Escriba el nuevo cvv de la tarjeta.");
      String cvvCadena = entrada.nextLine();
      try{
          cvv = Integer.parseInt(cvvCadena);
        }
        catch (NumberFormatException ex){
          System.out.println("Ocurrio un error, puede que su cvv sea invalido");
          edita(pago);
          return;
        }
      pago.getTarjeta().setCVV(cvv);
      System.out.println("El CVV fue cambiado exitosamente.");
      archivo.escribePagosOnline(pagosOnline);
    }

    /**
     * Método auxiliar cambiaCantidad, cambia la cantidad a pagar.
     * @param pago, el pago al cual se le cambiara la cantidad.
     */
     private void cambiaCantidad(PagoOnline pago){
      int cantidad = 0;
      System.out.println("Escriba la nueva cantidad a pagar.");
      String cantidadCadena = entrada.nextLine();
      try{
          cantidad = Integer.parseInt(cantidadCadena);
        }
        catch (NumberFormatException ex){
          System.out.println("Ocurrio un error, puede que su cantidad ingresada sea invalida.");
          edita(pago);
          return;
        }
      pago.setCantidad(cantidad);
      System.out.println("La cantidad fue cambiada exitosamente.");
      archivo.escribePagosOnline(pagosOnline);
    }
  }
