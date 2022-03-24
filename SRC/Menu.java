import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Menu, maneja los menus de cada objeto.
 * @author Sánchez Urbano Cynthia
 * @version 21/03/2022
 */
public class Menu {
    /* Variable entrada, permite la interacción con el usuario. */
    private Scanner entrada = new Scanner(System.in);
    private String eleccion = "";
    private ArrayList<Estetica> esteticas = new ArrayList<>();
    private EsteticaArchivo archivo = new EsteticaArchivo();

    public Menu(){
      System.out.println("Cargando datos de Esteticas...");
      try{
        esteticas = archivo.leeEsteticas();
        System.out.println("Listo...");
      }catch(Exception e){
        System.out.println(e);
      }
    }

    public void despliegaMenu(){
        System.out.println("\n-------[ Elige una opción ]-------\n"+
                           "1-. Estetica\n"+
                           "2-. Dueño\n"+
                           "3-. Mascota\n"+
                           "4-. Pago\n"+
                           "5-. Salir");
        eleccion = entrada.nextLine();
        switch (eleccion) {
            case "1":
            MenuEstetica me = new MenuEstetica(esteticas);
            me.despliegaMenusEstetica();
            break;

            case "4":
            despliegaMenusPago();
            break;

            case "5":
            System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
            System.exit(0);
            break;

            default:
            System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
            break;
        }
        despliegaMenu();
    }

    public void despliegaMenusPago(){
        System.out.println("\n-------[ Elige una opción de Pago]-------\n"+
                           "1-. Pago Fisico\n"+
                           "2-. Pago Online\n"+
                           "3-. Volver al menu anterior\n");
        String eleccion = entrada.nextLine();
        switch (eleccion) {
            case "1":
            MenuPagoFisico mpf = new MenuPagoFisico(this);
            break;
            case "2":
            MenuPagoOnline mpo = new MenuPagoOnline(this);
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
