import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuPagoFisico {
  private ArrayList<PagoFisico> pagosFisicos = new ArrayList<>();
  private PagoFisicoArchivo archivo = new PagoFisicoArchivo();
  /* Variable entrada, permite la interacción con el usuario. */
  private Scanner entrada = new Scanner(System.in);
  private Menu menu = new Menu();
  /**
   * @param args the command line arguments
   */
   public MenuPagoFisico() {
     System.out.println("Cargando datos de Pagos Fisicos...");
     try{
       pagosFisicos = archivo.leePagosFisicos();
       System.out.println("Listo...");
     }catch(Exception e){
       System.out.println(e);
     }
     despliegaMenuPrincipal();
   }

   public void despliegaMenuPrincipal(){
     System.out.println("\n[ Ingresa la opción deseada ]\n" +
                        "1-Pago efectivo\n" +
                        "2-Pago por targeta\n"+
                        "3-Ver pagos fisicos\n"+
                        "4-Menu anterior\n"+
                        "5-Salir\n");
     String eleccion = entrada.nextLine();
     switch (eleccion) {
       case "1" :
       System.out.println("Escriba el nombre del cliente");
       String c1 = entrada.nextLine();
       PagoFisico pf1 = new PagoFisico(c1,"Efectivo");
       pagosFisicos.add(pf1);
       archivo.escribePagosFisicos(pagosFisicos);
       despliegaMenuPrincipal();
       break;
       case "2" :
       System.out.println("Escriba el nombre del cliente\n");
       String c2 = entrada.nextLine();
       PagoFisico pf2 = new PagoFisico(c2,"Targeta");
       pagosFisicos.add(pf2);
       archivo.escribePagosFisicos(pagosFisicos);
       despliegaMenuPrincipal();
       break;
       case "3" :
       for(int i=0;i<pagosFisicos.size();i++){
           System.out.println(pagosFisicos.get(i).toString());
       }
       despliegaMenuPrincipal();
       break;
       case "4" :
       menu.despliegaMenusPago();
       break;
       case "5" :
       System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
       System.exit(0);
       default:
       System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
       despliegaMenuPrincipal();
     }
   }
 }