import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase MenuMAscota, maneja los menus de las Estéticas.
 * @author Aguirre Chavez Alejandra
  * @version 23/03/2022
 */

public class MenuMascota {
  private ArrayList<Mascota> mascotas;
  private Scanner entrada = new Scanner(System.in);
  private String eleccion = "";
  private MascotaArchivo archivo = new MascotaArchivo();
  
     /**
     * Constructor básico.
     * @param esteticas -- Es la lista de estéticas que se desplegarán.
     */
    public MenuMascota(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
        try{
        mascotas = archivo.leeMascotas();
        System.out.println("Listo...");
        }catch(Exception e){
        System.out.println(e);
      }
    }
  
  
  /**
   * @param args the command line arguments
   */
   /**
     public Menu() {
     System.out.println("Cargando datos...");
     try{
       mascotas = archivo.leeMascotas();
       System.out.println("Listo...");
     }catch(Exception e){
       System.out.println(e);
     }
   }
   */
 
   public void despliegaMenusMascota(){
     System.out.println("\n[ Ingresa la opción deseada ]\n" +
                        "1-Agregar Mascota\n" +
                        "2-Ver Mascotas\n"+
                        "3-Editar Mascotas\n"+
                        "4-Borrar Mascotas\n"+
                        "5-Salir y Guardar\n");
     String eleccion = entrada.nextLine();
     switch (eleccion) {
       case "1" :
       despliegaMenuAgregMascota();
       despliegaMenusMascota();
       break;
       case "2" :
       if (mascotas.size()<1){
                System.out.println("No hay mascotas registradas.");
                break;
            } else {
                System.out.println("Las mascotas registradas en la base son:");
                for(int i=0;i<mascotas.size();i++)
                    System.out.println(mascotas.get(i).toString());
                break;
            }
       case "3" :
       despliegaMenuModMascota();
       despliegaMenusMascota();
       break;
       case "4" :
       System.out.println("\nIngresa la clave de la mascota que quieres borrar: ");
            int clave;
            try {
                clave = Integer.parseInt(entrada.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una clave entera.");
                break;
            }
            for(int i=0;i<mascotas.size();i++) {
                if(mascotas.get(i).getClave() == clave) {
                    mascotas.remove(i);
                    System.out.println("La mascota fue eliminada");
                    break;
                } else {
                    if(i == mascotas.size()-1)
                        System.out.println("La clave dada no está registrada." +
                        " Ninguna mascota fue borrada.");
                }
            }     
       despliegaMenusMascota();
       break;
       case "5" :
       if(!mascotas.isEmpty()){
                System.out.println("Guardando datos de Mascotas...");
                MascotaArchivo mascotaArchivo = new MascotaArchivo();
                mascotaArchivo.escribeMascota(mascotas);
                System.out.println("Datos guardados.");
       }
       System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
       System.exit(0);
       default:
       System.out.println("Esa opción no es valida, vuelvelo a intentar.\n");
     }
     despliegaMenusMascota();
   }

 
 
 /**
     * Despliega el menú para agregar estéticas desde la terminal.
     */
    public void despliegaMenuAgregMascota() {
        System.out.println("Ingresa la clave de la nueva mascota (cifras enteras): ");
        int clave;
        try {
            clave = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar una clave válida en números enteros.");
            return;
        }
        System.out.println("Ingresa el nombre del dueño: ");
        String nombreduenio = entrada.nextLine();
        System.out.println("Ingresa el nombre de la mascota: ");
        String nombre = entrada.nextLine();
        FechaNac fechanac = despliegaNuevaFecha();
        System.out.println("Ingresa el peso de la mascota:");
          int peso;
        try {
            peso = Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar un peso válido en números enteros.");
            return;
        } /***/
        //String peso = entrada.nextLine();
        System.out.println("Ingresa la especie de la mascota: ");
        String especie = entrada.nextLine();
        System.out.println("Ingresa la raza de la mascota: ");
        String raza = entrada.nextLine();  
        Mascota mascota = new Mascota(clave, nombreduenio, nombre, fechanac,peso, especie, raza );
        System.out.println(mascota.toString());
        mascotas.add(mascota);
        System.out.println("Mascota " + clave + " agregada con éxito");
        despliegaMenusMascota();
    }

    /**
     * Despliega el menú para modificar mascotas desde la terminal.
     */
    public void despliegaMenuModMascota() {
        System.out.println("\nIngresa la clave de la Mascota que quieres modificar: ");
        int clave;
        try {
            clave = Integer.parseInt(entrada.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar una clave válida.");
            return;
        }
        Mascota mascota = null;
        for(int i=0;i<mascotas.size();i++) {
            if(mascotas.get(i).getClave() == clave) {
                mascota = mascotas.get(i);
                break;
            }
        }
        if(mascota == null) {
            System.out.println("La clave dada no está registrada." +
                            " Ninguna fue modificada.");
            return;
        }
        System.out.println("Ingresa la opción que quieres modificar: \n" +
                        " 1-Clave.\n 2-Nombre del Dueño.\n 3-Nombre de la Mascota.\n 4-Fecha de Nacimiento.\n" +
                        " 5-Peso.\n 6-Especie. \n 7-Raza. \n 8-Salir.");
          eleccion = entrada.nextLine();      
          System.out.println("Ingresa el nuevo valor: ");
          String valor = entrada.nextLine();
          if(valor == "") {
            System.out.println("El valor no puede ser vacío.");
            return;
          }         
         switch(eleccion) {
            case "1":
            int claveNueva;
            try {
                claveNueva = Integer.parseInt(valor);
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un valor válido.");
                break;
            }
            mascota.setClave(claveNueva);
            System.out.println("Clave modificada con éxito.");
            break;

            case "2":
            mascota.setNombreDuenio(valor);
            System.out.println("Nombre del dueño modificado con éxito.");
            break;

            case "3":
            mascota.setNombre(valor);
            System.out.println("Nombre de la mascota modificado con éxito.");
            break;
            
            case "4":
            FechaNac fechanacNueva = despliegaNuevaFecha();
            mascota.setFechaNac(fechanacNueva);
            System.out.println("Fecha de Nacimiento modificada con éxito");
            break;

            case "5":
            int PesoNueva;
            try {
                PesoNueva = Integer.parseInt(valor);
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un valor válido.");
                break;
            }
            mascota.setPeso(PesoNueva); //mascota.setPeso(valor);
            System.out.println("Peso modificado con éxito.");
            break;

            case "6":
            mascota.setEspecie(valor);
            System.out.println("Especie modificada con éxito.");
            break;

            case "7":
            mascota.setRaza(valor);
            System.out.println("Raza modificada con éxito.");
            break;
            
            case "8":
            despliegaMenusMascota();
            break;

            default:
            System.out.println("Ingresa una opción válida.");
            break;
        }  
           
   }

   /**
    * Despliega la interfaz para crear una dirección desde la terminal.
    * @return -- La dirección correspondiente a los parámetros dados en la terminal.
    */
    public FechaNac despliegaNuevaFecha() {
        System.out.println("Ingresa el dia de nacimiento de la mascota: ");
        int dia=Integer.parseInt(entrada.nextLine());
        System.out.println("Ingresa el mes de nacimiento de la mascota (de preferencia en palabras) ");
        String mes = entrada.nextLine();
        System.out.println("Ingresa el año de nacimiento de la mascota ");
        int anio = Integer.parseInt(entrada.nextLine());
        return new FechaNac(dia, mes, anio);
    }
    
    public static void main(String[] args) {
        MenuMascota menu = new MenuMascota(new ArrayList<>());
        menu.despliegaMenuAgregMascota();
    }
 
  
  
 
 
}
