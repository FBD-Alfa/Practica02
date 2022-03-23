import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class Menu {
    /* Variable entrada, permite la interacción con el usuario. */
    private Scanner entrada = new Scanner(System.in);
    String eleccion = "";
    ArrayList<Estetica> esteticas = new ArrayList<>();

    public Menu(ArrayList<Estetica> esteticas) {
        this.esteticas = esteticas;
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
            despliegaMenusEstetica();
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

    public void despliegaMenusEstetica() {
        System.out.println("\nIngresa la opción deseada:\n" +
                            " 1-Agregar Estética.\n 2-Ver Estéticas.\n" + 
                            " 3-Editar Estética.\n 4-Borrar Estética.\n" +
                            " 5-Salir");
        eleccion = entrada.nextLine();
        switch (eleccion) {
            case "1":
            despliegaMenuAgregEst();
            break;

            case "2":
            if (esteticas.size()<1){
                System.out.println("No hay esteticas registradas");
            break;
            } else {
                for(int i=0;i<esteticas.size();i++)
                    System.out.println(esteticas.get(i).toString());
                break;
            }

            case "3":
            despliegaMenuModEst();
            break;

            case "4":
            System.out.println("\nIngresa la clave de la Estética que quieres borrar: ");
            int clave;
            try {
                clave = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ingresa una clave entera.");
                break;
            }
            for(int i=0;i<esteticas.size();i++) {
                if(esteticas.get(i).getClave() == clave) {
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

            case "5":
            if(!esteticas.isEmpty()){
                System.out.println("Guardando datos de Estéticas...");
                EsteticaArchivo esteticaArchivo = new EsteticaArchivo();
                esteticaArchivo.escribeEstetica(esteticas);
                System.out.println("Datos guardados.");
            }
            System.out.println("\n----------------[ FIN DEL PROGRAMA ADIÓS T-T ]---------------\n");
            System.exit(0);
            break;

            default:
            System.out.println("Esa opción no es valida, vuélvelo a intentar.\n");
            break;

        }
        despliegaMenusEstetica();
    }

    public void despliegaMenuAgregEst() {
        System.out.println("Ingresa la clave de la nueva estética: ");
        int clave;
        try {
            clave = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar una clave válida.");
            return;
        }
        System.out.println("Ingresa el nombre de la nueva estética: ");
        String nombre = entrada.nextLine();
        Direccion direccion = despliegaNuevaDir();
        System.out.println("Ingresa el teléfono de la nueva estética: ");
        Long telefono;
        try {
            telefono = Long.parseLong(entrada.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un teléfono válido.");
            return;
        }
        System.out.println("Ingresa el horario: ");
        String horario = entrada.nextLine();
        System.out.println("Ingresa el número de consultorios de la nueva estética: ");
        Short noConsult;
        try {
            noConsult = Short.parseShort(entrada.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un número válido.");
            return;
        }
        esteticas.add(new Estetica(clave, nombre, direccion, telefono, horario, noConsult));
        System.out.println("Estética " + clave + " agregada con éxito");
    }

    public void despliegaMenuModEst() {
        System.out.println("\nIngresa la clave de la Estética que quieres modificar: ");
        int clave;
        try {
            clave = entrada.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar una clave válida.");
            return;
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
            return;
        }
        System.out.println("Ingresa la opción que quieres modificar: \n" +
                        " 1-Clave.\n 2-Nombre.\n 3-Dirección.\n 4-Teléfono.\n" +
                        " 5-Horario.\n 6-Número de consultorios.\n 7-Salir.");
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
            estetica.setClave(claveNueva);
            System.out.println("Clave modificada con éxito.");
            break;

            case "2":
            estetica.setNombre(valor);
            System.out.println("Nombre modificado con éxito.");
            break;

            case "3":
            Direccion dirNueva = despliegaNuevaDir();
            estetica.setDireccion(dirNueva);
            System.out.println("Dirección modificada con éxito.");
            break;

            case "4":
            Long telNuevo;
            try {
                telNuevo = Long.parseLong(valor);
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar una valor válido.");
                break;
            }
            estetica.setTelefono(telNuevo);
            System.out.println("Clave modificada con éxito.");
            break;

            case "5":
            estetica.setHorario(valor);
            System.out.println("Horario modificado con éxito.");
            break;

            case "6":
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
    }

    public Direccion despliegaNuevaDir() {
        System.out.println("Ingresa el estado de la dirección: ");
        String estado = entrada.nextLine();
        System.out.println("Ingresa la calle de la dirección: ");
        String calle = entrada.nextLine();
        System.out.println("Ingresa el código postal de la dirección: ");
        String cp = entrada.nextLine();
        System.out.println("Ingrese el número de la dirección: ");
        String numero = entrada.nextLine();
        return new Direccion(estado, calle, cp, numero);
    }
}
