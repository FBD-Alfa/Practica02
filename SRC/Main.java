import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Main que sirve de ejemplo para lo que van a entregar en la practica 2
 * @author Ricardo Badillo Macias
 * @version 16/03/2022
 */
public class Main {

    /**
     * FALTA MODIFICAR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	    String opcion = "";
	    Scanner input = new Scanner(System.in);
        ArrayList<Estetica> esteticas = new ArrayList<>();
        EsteticaArchivo estArchivo = new EsteticaArchivo();
        // FALTA INICIALIZAR EL RESTO
        Menu menu;
        System.out.println("\nIngresa la opcion deseda:\n 1-Cargar datos.\n 2-Crear nuevo.\n 3-Salir.");
        opcion = input.nextLine();
        switch(opcion){
            case "1":
            System.out.println("Cargando datos de Estéticas...");
            try{
                esteticas = estArchivo.leeEsteticas();
                System.out.println("Listo.");
            } catch(Exception e) {
                 System.out.println(e);
            }
            // FALTA CARGAR LAS OTRAS BASES
            System.out.println("Cargando datos de Mascotas...");
            System.out.println("Cargando datos de Dueños...");
            menu = new Menu(input, esteticas);
            menu.despliegaMenu();
            break;

            case "2":
            menu = new Menu(input, esteticas);
            menu.despliegaMenu();
            break;

            case "3":
            System.out.println("Adios :D.");
            System.exit(0);
            break;

            default:
            System.out.println("Ingresa una opción válida.");
            break;
        }
        input.close();
    }
}
