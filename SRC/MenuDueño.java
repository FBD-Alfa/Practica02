import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Main que sirve de ejemplo para lo que van a entregar en la practica 2
 * @author Castro  Romero Ares Gael
 * @version 16/03/2022
 */
public class MenuDueño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera;
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        ArrayList<Dueño> dueños = new ArrayList<>();
        DueñoArchivo archivo = new DueñoArchivo();
        do {
            bandera = true;
            System.out.println("Ingresa la opcion deseda\n 1-CargarDatos\n 2-CrearNuevo\n 3-Salir");
            try{
                opcion = input.nextInt();
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Ingresa un número como opción");
            }
            if(opcion > 0 && opcion < 4){
                switch(opcion){
                case 1:
                    System.out.println("Cargando datos de Dueños...");
                    try{
                        dueños = archivo.leeOperadores();
                        System.out.println("Listo...");
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    do{
                        bandera = true;
                        System.out.println("Ingresa la opción deseada\n" + "1-Agregar Operador\n" + "2-Ver Operadores\n"
                                           + "3-Editar Operador\n" + "4-Borrar Operador\n" + "5-Salir\n");
                        try {
                            opcion = input.nextInt();
                        } catch (InputMismatchException e) {
                            input.next();
                            System.out.println("Ingresa un número como opción");
                        }
                        if (opcion > 0 && opcion < 6) {
                            switch (opcion) {
                            case 1:
                                input.nextLine();
                              System.out.println("Ingresa Nombre(s) del dueño ");
                                    
                                     String nombrePropio = input.nextLine();                                        }
          
                                     System.out.println("Ingresa Apellido Paterno del dueño ");
                                    
                                     String apellidoP = input.nextLine();                        
                                     
      
                                        
                                     System.out.println("Ingresa Apellido Materno del dueño ");
                                    
                                     String apellidoM = input.nextLine();
        
                                     System.out.println("Ingresa el CURP del dueño ");
                                     
                                     String CURP = input.nextLine();
                                  
                                     System.out.println("Ingresa el telefono del dueño ");
                                     
                                     Long telefono = input.nextLong();
                                     input.nextLine();
                                      
                                     System.out.println("Ingresa la fecha de nacimiento del dueño ");
 
                                     String fecha =  input.nextLine();
   
                                     System.out.println("Ingresa el email del  dueño ");
                                   
                                     String fecha=input.nextLine();
                   
                                        
                                     System.out.println("Ingresa el estado donde se encuentra el dueño ");
                                    
                                     String estado=input.nextLine();
                                    
                      
                                        
                                     System.out.println("Ingresa el estado donde la calle donde vive el dueño ");
                                    
                                     String calle=input.nextLine();
                 
                                       
                                     System.out.println("Ingresa el estado donde el código postal de  donde vive el dueño ");
                                    
                                     String cp=input.nextLine();
                 
                                     System.out.println("Ingresa el estado donde el número de la casa de donde vive el dueño ");
                                   
                                     String numero=input.nextLine();
               
                                     Direccion nuevaDireccion = new Direccion(estado, calle, cp, numero);
                                     Dueño nuevoDueño = new Dueño(CURP,nombrePropio,apellidoP,apellidoM,nuevaDireccion,telefono,fecha,email);
                                dueños.add(nuevoDueño);
                                System.out.println("Se agrego el Dueño");
				
                                break;
                            case 2:
                                for(int i=0;i<dueños.size();i++){
                                    System.out.println(dueños.get(i).toString());
                                }
                                break;
                    
                            case 3:
                                if(dueños.size()==0){
                                    System.out.println("No puedes editar ya que no hay un dueño en la lista");
                                    break;
                                }
                                input.nextLine();
                                System.out.println("Ingresa solamente el  CURP del dueño del que deseas editar información:");
                                String CURP = input.nextLine();
                                Dueño dueñoAuxiliar=null;
                                for(int i=0;i<operadores.size();i++){
                                    if( dueños.get(i).getCURP().equals(nombre)){
                                        dueñoAuxiliar=dueños.get(i);
                                    }
                                }
                                System.out.println("Ingresa la opción deseada\n" + "1-Editar Nombre \n" + "2-Editar Apellido Paterno\n"
                                                   + "3-Editar Apellido Materno\n" + "4-Editar CURP\n" + "5-Editar direccion\n"+ "6-Editar teléfono\n"+ "7-Editar fecha de nacimiento\n"
                                                   + "8-Editar email\n ");
                                try {
                                    opcion = input.nextInt();
                                } catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa un número como opción");
                                }
                                input.nextLine();
                                if(opcion > 0 && opcion < 9){
                                    switch(opcion){
                                    case 1:
                                        System.out.println("Ingresa los nuevos Nombre(s) del dueño ");
                                        try{
                                            String nombrePropio = input.nextLine();
                                            dueñoAuxiliar.setNombre(nombrePropio);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el nombre");
                                        }

                                        
                                        break;
                                    case 2:
                                                                                        
                                        System.out.println("Ingresa el nuevo apellido paterno del dueño ");
                                        try{
                                            String apellidoP = input.nextLine();
                                            dueñoAuxiliar.setApellidoP(apellidoP);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el apellido paterno");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el nuevo apellido materno del dueño ");
                                        try{
                                            String apellidoM = input.nextLine();
                                            dueñoAuxiliar.setApellidoM(apellidoM);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el apellido materno");
                                        }
                                        break;
                                          
                                    case 4:
                                        System.out.println("Ingresa el nuevo CURP ");
                                        try{
                                            String CURP = input.nextLine();
                                            dueñoAuxiliar.setFecha(CURP);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el CURP");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Ingresa la nueva direccion  del dueño ");
                                        try{
                                            System.out.println("Ingresa el estado");
                                            String estado = input.nextLine();
                                            System.out.println("Ingresa la calle");
                                            String calle = input.nextLine();
                                            System.out.println("Ingresa el Código Postal");
                                            String cp = input.nextLine();
                                            System.out.println("Ingresa el numero");
                                            String numero= input.nextLine();
                                            Direccion nuevaDireccion = new Direccion(estado,calle,cp,numero);
                                            dueñoAuxiliar.setDireccion(nuevaDireccion);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente la direccion");
                                        }
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el nuevo telefono del dueño ");
                                        try{
                                            long telefono = input.nextLong();
                                            dueñoAuxiliar.setTelefono(telefono);
                                            input.nextLine();
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el telefono");
                                        }
                                        break;
                                    case 7:
                                        System.out.println("Ingresa la nueva fecha de nacimiento del dueño ");
                                        try{
                                            String fecha = input.nextLine();
                                            dueñoAuxiliar.setFecha(fecha);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente la fecha de nacimiento");
                                        }
                                        break;
                                    case 8:
                                        System.out.println("Ingresa el nuevo email del dueño ");
                                        try{
                                            String email = input.nextLine();
                                            dueñoAuxiliar.setEmail(email);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el email");
                                        }
                                        break;
                                    
                                    case 9:
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


                                break;
                    
                            case 4:
                                if(dueños.size()==0){
                                    System.out.println("No puedes eliminar ya que no hay un dueño en la lista");
                                    break;
                                }
                                System.out.println("Ingresa el CURP del dueño que deseas eliminar");
                                int indice=0;
                                try{
                                    String CURP1= input.nextLine();
                                    for(int i=0;i<dueños.size();i++){
                                        if(dueños.get(i).getNombre().equals(CURP1)){
                                            indice=i;
                                        }
                                    }
                                    dueños.remove(indice);
                                            
                                }
                                catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa adecuadamente el nombre del dueño a eliminar");
                                }


                                break;
					
                            case 5:
                                if(!operadores.isEmpty()){
                                    System.out.println("Guardando datos de los dueños..");
                                    archivo.escribeOpeador(operadores);
                                    System.out.println("Datos guardados");
                                }
                                bandera = false;
                                System.out.println("Saliendo del sistema...\nHasta pronto.");
                                break;
                            default:
                                break;
                            }
                        
                    }while(bandera);
                    break;
                
                case 2:
                    do{
                        bandera = true;
                        System.out.println("Ingresa la opción deseada\n" + "1-Agregar Operador\n" + "2-Ver Operadores\n"
                                           + "3-Editar Operador\n" + "4-Borrar Operador\n" + "5-Salir\n");
                        try {
                            opcion = input.nextInt();
                        } catch (InputMismatchException e) {
                            input.next();
                            System.out.println("Ingresa un número como opción");
                        }
                        if (opcion > 0 && opcion < 6) {
                            switch (opcion) {
                            case 1:
                                input.nextLine();
                              System.out.println("Ingresa Nombre(s) del dueño ");
                                    
                                     String nombrePropio = input.nextLine();                                        }
          
                                     System.out.println("Ingresa Apellido Paterno del dueño ");
                                    
                                     String apellidoP = input.nextLine();                        
                                     
      
                                        
                                     System.out.println("Ingresa Apellido Materno del dueño ");
                                    
                                     String apellidoM = input.nextLine();
        
                                     System.out.println("Ingresa el CURP del dueño ");
                                     
                                     String CURP = input.nextLine();
                                  
                                     System.out.println("Ingresa el telefono del dueño ");
                                     
                                     Long telefono = input.nextLong();
                                     input.nextLine();
                                      
                                     System.out.println("Ingresa la fecha de nacimiento del dueño ");
 
                                     String fecha =  input.nextLine();
   
                                     System.out.println("Ingresa el email del  dueño ");
                                   
                                     String fecha=input.nextLine();
                   
                                        
                                     System.out.println("Ingresa el estado donde se encuentra el dueño ");
                                    
                                     String estado=input.nextLine();
                                    
                      
                                        
                                     System.out.println("Ingresa el estado donde la calle donde vive el dueño ");
                                    
                                     String calle=input.nextLine();
                 
                                       
                                     System.out.println("Ingresa el estado donde el código postal de  donde vive el dueño ");
                                    
                                     String cp=input.nextLine();
                 
                                     System.out.println("Ingresa el estado donde el número de la casa de donde vive el dueño ");
                                   
                                     String numero=input.nextLine();
               
                                     Direccion nuevaDireccion = new Direccion(estado, calle, cp, numero);
                                     Dueño nuevoDueño = new Dueño(CURP,nombrePropio,apellidoP,apellidoM,nuevaDireccion,telefono,fecha,email);
                                dueños.add(nuevoDueño);
                                System.out.println("Se agrego el Dueño");
				
                                break;
                            case 2:
                                for(int i=0;i<dueños.size();i++){
                                    System.out.println(dueños.get(i).toString());
                                }
                                break;
                    
                            case 3:
                                if(dueños.size()==0){
                                    System.out.println("No puedes editar ya que no hay un dueño en la lista");
                                    break;
                                }
                                input.nextLine();
                                System.out.println("Ingresa solamente el  CURP del dueño del que deseas editar información:");
                                String CURP = input.nextLine();
                                Dueño dueñoAuxiliar=null;
                                for(int i=0;i<operadores.size();i++){
                                    if( dueños.get(i).getCURP().equals(nombre)){
                                        dueñoAuxiliar=dueños.get(i);
                                    }
                                }
                                System.out.println("Ingresa la opción deseada\n" + "1-Editar Nombre \n" + "2-Editar Apellido Paterno\n"
                                                   + "3-Editar Apellido Materno\n" + "4-Editar CURP\n" + "5-Editar direccion\n"+ "6-Editar teléfono\n"+ "7-Editar fecha de nacimiento\n"
                                                   + "8-Editar email\n ");
                                try {
                                    opcion = input.nextInt();
                                } catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa un número como opción");
                                }
                                input.nextLine();
                                if(opcion > 0 && opcion < 9){
                                    switch(opcion){
                                    case 1:
                                        System.out.println("Ingresa los nuevos Nombre(s) del dueño ");
                                        try{
                                            String nombrePropio = input.nextLine();
                                            dueñoAuxiliar.setNombre(nombrePropio);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el nombre");
                                        }

                                        
                                        break;
                                    case 2:
                                                                                        
                                        System.out.println("Ingresa el nuevo apellido paterno del dueño ");
                                        try{
                                            String apellidoP = input.nextLine();
                                            dueñoAuxiliar.setApellidoP(apellidoP);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el apellido paterno");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el nuevo apellido materno del dueño ");
                                        try{
                                            String apellidoM = input.nextLine();
                                            dueñoAuxiliar.setApellidoM(apellidoM);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el apellido materno");
                                        }
                                        break;
                                          
                                    case 4:
                                        System.out.println("Ingresa el nuevo CURP ");
                                        try{
                                            String CURP = input.nextLine();
                                            dueñoAuxiliar.setFecha(CURP);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el CURP");
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Ingresa la nueva direccion  del dueño ");
                                        try{
                                            System.out.println("Ingresa el estado");
                                            String estado = input.nextLine();
                                            System.out.println("Ingresa la calle");
                                            String calle = input.nextLine();
                                            System.out.println("Ingresa el Código Postal");
                                            String cp = input.nextLine();
                                            System.out.println("Ingresa el numero");
                                            String numero= input.nextLine();
                                            Direccion nuevaDireccion = new Direccion(estado,calle,cp,numero);
                                            dueñoAuxiliar.setDireccion(nuevaDireccion);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente la direccion");
                                        }
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el nuevo telefono del dueño ");
                                        try{
                                            long telefono = input.nextLong();
                                            dueñoAuxiliar.setTelefono(telefono);
                                            input.nextLine();
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el telefono");
                                        }
                                        break;
                                    case 7:
                                        System.out.println("Ingresa la nueva fecha de nacimiento del dueño ");
                                        try{
                                            String fecha = input.nextLine();
                                            dueñoAuxiliar.setFecha(fecha);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente la fecha de nacimiento");
                                        }
                                        break;
                                    case 8:
                                        System.out.println("Ingresa el nuevo email del dueño ");
                                        try{
                                            String email = input.nextLine();
                                            dueñoAuxiliar.setEmail(email);
                                        }
                                        catch (InputMismatchException e) {
                                            input.next();
                                            System.out.println("Ingresa adecuadamente el email");
                                        }
                                        break;
                                    
                                    case 9:
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


                                break;
                    
                            case 4:
                                if(dueños.size()==0){
                                    System.out.println("No puedes eliminar ya que no hay un dueño en la lista");
                                    break;
                                }
                                System.out.println("Ingresa el CURP del dueño que deseas eliminar");
                                int indice=0;
                                try{
                                    String CURP1= input.nextLine();
                                    for(int i=0;i<dueños.size();i++){
                                        if(dueños.get(i).getNombre().equals(CURP1)){
                                            indice=i;
                                        }
                                    }
                                    dueños.remove(indice);
                                            
                                }
                                catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa adecuadamente el nombre del dueño a eliminar");
                                }


                                break;
					
                            case 5:
                                if(!operadores.isEmpty()){
                                    System.out.println("Guardando datos de los dueños..");
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
                    }while(bandera);
                case 3:
                    System.out.println("Adios :D.");
                    bandera = false;
                    break;
                default:
                    break;
                }
            }
            
        } while (bandera);

    }  
}
