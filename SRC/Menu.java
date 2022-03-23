
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
  /* Variable entrada, permite la interacción con el usuario. */
  private Scanner entrada = new Scanner(System.in);

  public void despliegaMenu(){
    System.out.println("\n-------[ Elige una opción ]-------\n"+
                       "1-. Estetica\n"+
                       "2-. Dueño\n"+
                       "3-. Mascota\n"+
                       "4-. Pago\n"+
                       "5-. Salir");
    String eleccion = entrada.nextLine();
    switch (eleccion) {
      case "4":
      despliegaMenusPago();
      break;
      case "5":
      System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
      System.exit(0);
      default:
      System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
      despliegaMenusPago();
    }
  }

  public void despliegaMenusPago(){
    System.out.println("\n-------[ Elige una opción de Pago]-------\n"+
                       "1-. Pago Fisico\n"+
                       "2-. Pago Online\n"+
                       "3-. Volver al menu anterior\n");
                       String eleccion = entrada.nextLine();
    switch (eleccion) {
      case "1":
      MenuPagoFisico mpf = new MenuPagoFisico();
      break;
      case "2":
      MenuPagoOnline mpo = new MenuPagoOnline();
      break;
      case "3":
      despliegaMenu();
      break;
      default:
      System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
      despliegaMenusPago();
    }
  }
}
