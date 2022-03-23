import java.util.ArrayList;
import java.util.InputMismatchException;
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
        boolean bandera;
	    int opcion = 0;
	    Scanner input = new Scanner(System.in);
        ArrayList<Estetica> esteticas = new ArrayList<>();
        EsteticaArchivo estArchivo = new EsteticaArchivo();
        // FALTA INICIALIZAR EL RESTO
	    do {
            bandera = true;
            System.out.println("\nIngresa la opcion deseda:\n 1-Cargar datos.\n 2-Crear nuevo.\n 3-Salir.");
            try{
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número como opción.");
                opcion = 0;
            }
            switch(opcion){
                case 1:
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
                    do{
                        bandera = true;
                        System.out.println("\nIngresa la opción deseada:\n" +
                        " 1-Agregar Estética.\n 2-Ver Estéticas.\n" + 
                        " 3-Editar Estética.\n 4-Borrar Estética.\n" +
                        " 5-Agregar Mascota.\n 6-Ver Mascotas.\n" + 
                        " 7-Editar Mascota.\n 8-Borrar Mascota.\n" + 
                        " 9-Agregar Dueño.\n 10-Ver Dueños.\n" + 
                        " 11-Editar Dueño.\n 12-Borrar Dueño.\n 13-Salir.\n");
                        try {
                            opcion = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Ingresa un número como opción.");
                            opcion = 0;
                        }
                        switch (opcion) {
                            case 1:
                                // FALTA IMPLEMENTAR
                                System.out.println("Se agregó la Estética.");
                            break;

                            case 2:
                                for(int i=0;i<esteticas.size();i++) {
                                    System.out.println(esteticas.get(i).toString());
                                }
                            break;
            
                            case 3:
                                System.out.println("\nIngresa la clave de la Estética que quieres modificar: ");
                                int clave;
                                try {
                                    clave = input.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("Debes ingresar una clave válida.");
                                    break;
                                }
                                Estetica estetica = null;
                                for(int i=0;i<esteticas.size();i++) {
                                    if(esteticas.get(i).getClave() == clave) {
                                        estetica = esteticas.get(i);
                                        break;
                                    }
                                }
                                if(estetica == null) {
                                    System.out.println("La clave dada no está registrada." +
                                            " Ninguna fue modificada.");
                                    break;
                                }
                                System.out.println("Ingresa la opción que quieres modificar: \n" +
                                " 1-Clave.\n 2-Nombre.\n 3-Dirección.\n 4-Teléfono.\n" +
                                " 5-Horario.\n 6-Número de consultorios.");
                                try {
                                    opcion = input.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("Ingresa un número como opción.");
                                    opcion = 0;
                                    break;
                                }
                                System.out.println("Ingresa el nuevo valor: ");
                                String valor = input.next();
                                switch(opcion) {
                                    case 1:
                                        int claveNueva;
                                        try {
                                            claveNueva = Integer.parseInt(valor);
                                        } catch (NumberFormatException e) {
                                            System.out.println("Debes ingresar una valor válido.");
                                            break;
                                        }
                                        estetica.setClave(claveNueva);
                                        System.out.println("Clave modificada con éxito.");
                                    break;

                                    case 2:
                                        estetica.setNombre(valor);
                                        System.out.println("Nombre modificado con éxito.");
                                    break;

                                    case 3:
                                        //FALTA IMPLEMENTAR
                                    break;

                                    case 4:
                                        int telNuevo;
                                        try {
                                            telNuevo = Integer.parseInt(valor);
                                        } catch (NumberFormatException e) {
                                            System.out.println("Debes ingresar una valor válido.");
                                            break;
                                        }
                                        estetica.setTelefono(telNuevo);
                                        System.out.println("Clave modificada con éxito.");
                                    break;

                                    case 5:
                                        estetica.setHorario(valor);
                                        System.out.println("Horario modificado con éxito.");
                                    break;

                                    case 6:
                                        short numNuevo;
                                        try {
                                            numNuevo = Short.parseShort(valor);
                                        } catch (NumberFormatException e) {
                                            System.out.println("Debes ingresar una valor válido.");
                                            break;
                                        }
                                        estetica.setNoConsultorios(numNuevo);
                                        System.out.println("Número de consultorios modificado con éxito.");
                                    break;

                                    default:
                                        System.out.println("Ingresa una opción válida.");
                                    break;
                                }
                            break;
            
                            case 4:
                                System.out.println("\nIngresa la clave de la Estética que quieres borrar: ");
                                int clave2;
                                try {
                                    clave2 = input.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.println("Ingresa una clave entera.");
                                    break;
                                }
                                for(int i=0;i<esteticas.size();i++) {
                                    if(esteticas.get(i).getClave() == clave2) {
                                        esteticas.remove(i);
                                        System.out.println("La Estética fue eliminada");
                                        break;
                                    } else {
                                        if(i == esteticas.size()-1)
                                            System.out.println("La clave dada no está registrada." +
                                            " Ninguna fue borrada.");
                                    }
                                }
                            break;
            
                            case 5:
                            break;

                            case 6:
                            break;

                            case 7:
                            break;

                            case 8:
                            break;

                            case 9:
                            break;

                            case 10:
                            break;

                            case 11:
                            break;

                            case 12:
                            break;

                            case 13:
                                if(!esteticas.isEmpty()){
                                    System.out.println("Guardando datos de operadores...");
                                    estArchivo.escribeEstetica(esteticas);
                                    System.out.println("Datos guardados");
                                }
                                // FALTA ESCRIBIR EL RESTO
                                bandera = false;
                                System.out.println("Saliendo del sistema...\nHasta pronto.");
                            break;

                            default:
                                System.out.println("Ingresa un número válido.");
                            break;
                        }
                    } while(bandera);
                break;
            
                /**case 2:
                    do{
                       bandera = true;
                        System.out.println("Ingresa la opción deseada\n" + "1-Agregar Operador\n" + "2-Ver Operadores\n"
                        + "3-Editar Operador\n" + "4-Borrar Operador\n" + "5-Salir\n");
                        try {
                            opcion = input.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Ingresa un número como opción");
                        }
                        if (opcion > 0 && opcion < 6) {
                            switch (opcion) {
                                case 1:
                                    Operador operador = new Operador();
                                    operadores.add(operador);
                                    System.out.println("Se agrego el Operador");
            
                                break;
                                case 2:
                                    for(int i=0;i<operadores.size();i++){
                                        System.out.println(operadores.get(i).toString());
                                    }
                                break;
                
                                case 3:
                                break;
                
                                case 4:
                                break;
                
                                case 5:
                                    if(!operadores.isEmpty()){
                                        System.out.println("Guardando datos de operadores...");
                                        archivo.escribeOpeador(operadores);
                                        System.out.println("Datos guardados");
                                    }
                                    bandera = false;
                                    System.out.println("Saliendo del sistema...\nHasta pronto.");
                                break;
                                default:
                                break;
                            }
                        }
                    }while(bandera);*/

                case 3:
                    System.out.println("Adios :D.");
                    bandera = false;
                break;

                default:
                    System.out.println("Ingresa un número válido.");
                break;
            }
	    } while(bandera);
    }
}
