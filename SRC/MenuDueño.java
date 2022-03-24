import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Main que sirve de ejemplo para lo que van a entregar en la practica 2
 * @author Ricardo Badillo Macias
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
                        dueños = archivo.leeDueños();
                        System.out.println("Listo...");
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    do{
                        bandera = true;
                        System.out.println("Ingresa la opción deseada\n" + "1-Agregar Dueño\n" + "2-Ver Dueño\n"
                                           + "3-Editar Dueño\n" + "4-Borrar Dueño\n" + "5-Salir\n");
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
                                    
                                String nombrePropio = input.nextLine();                                        
          
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
                                   
                                String email=input.nextLine();
                   
                                        
                                System.out.println("Ingresa el estado donde vive el dueño ");
                                    
                                String estado=input.nextLine();
                                    
                      
                                        
                                System.out.println("Ingresa la calle donde vive el dueño ");
                                    
                                String calle=input.nextLine();
                 
                                       
                                System.out.println("Ingresa  el código postal de  donde vive el dueño ");
                                    
                                String cp=input.nextLine();
                 
                                System.out.println("Ingresa el número de la casa de donde vive el dueño ");
                                   
                                String numero=input.nextLine();
               
                                Direccion nuevaDireccion = new Direccion(estado,calle,cp,numero);
                                Dueño nuevoDueño = new Dueño(CURP,nombrePropio,apellidoP,apellidoM,nuevaDireccion,telefono,fecha,email);
                                System.out.println("Se agrego el nuevo Dueño");
				
                                break;
                            case 2:
                                for(int i=0;i<dueños.size();i++){
                                    System.out.println(dueños.get(i).toString());
                                }
                                break;
                    
                            case 3:
                                if(dueños.size()==0){
                                    System.out.println("No puedes editar ya que no hay dueños en la lista");
                                    break;
                                }
                                input.nextLine();
                                System.out.println("Ingresa solamente el  CURP del dueño del que deseas editar información:");
                                String CURPaux = input.nextLine();
                                Dueño dueñoAuxiliar=null;
                                for(int i=0;i<dueños.size();i++){
                                    if( dueños.get(i).getCURP().equals(CURPaux)){
                                        dueñoAuxiliar=dueños.get(i);
                                    }
                                }
                                System.out.println("Ingresa la opción deseada\n" + "1-Editar Nombre \n" + "2-Editar Apellido Paterno\n"
                                                   + "3-Editar Apellido Materno\n" + "4-Editar CURP\n" + "5-Editar direccion\n"+ "6-Editar teléfono\n"+ "7-Editar fecha\n"
                                                   + "8-Editar email\n" + "9-Salir\n");
                                try {
                                    opcion = input.nextInt();
                                } catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa un número como opción");
                                }
                                input.nextLine();
                                if(opcion > 0 && opcion < 10){
                                    switch(opcion){
                                    case 1:
                                        System.out.println("Ingresa los nuevos Nombre(s) del dueño ");
      
                                        String nombreProp = input.nextLine();
                                        dueñoAuxiliar.setNombre(nombreProp);


                                        
                                        break;
                                    case 2:
                                                                                        
                                        System.out.println("Ingresa el nuevo apellido paterno del dueño ");
                                      
                                        String apellidoPat = input.nextLine();
                                        dueñoAuxiliar.setApellidoP(apellidoPat);
                   
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el nuevo apellido materno del dueño ");
                                   
                                        String apellidoMat = input.nextLine();
                                        dueñoAuxiliar.setApellidoM(apellidoMat);
              
                                        break;
                                          
                                    case 4:
                                        System.out.println("Ingresa el nuevo CURP dueño ");
                                       
                                        String CURPD = input.nextLine();
                                        dueñoAuxiliar.setFecha(CURPD);
                     
                                        break;
                                    case 5:
                                        System.out.println("Ingresa la nueva direccion  del dueño ");
                                    
                                        System.out.println("Ingresa la nueva direccion  del dueño ");
                                        System.out.println("Ingresa el nuevo estado donde vive el dueño");
                                        String nuevoEstado=input.nextLine();
                                        System.out.println("Ingresa la nueva calle donde vive el dueño");
                                        String nuevaCalle=input.nextLine();
                                        System.out.println("Ingresa el nuevo código postal donde vive el dueño");
                                        String nuevoCodigo=input.nextLine();
                                        System.out.println("Ingresa el nuevo número de la casa donde vive el dueño");
                                        String nuevoNumero=input.nextLine();
                                        Direccion otraDireccion = new Direccion (nuevoEstado,nuevaCalle,nuevoCodigo,nuevoNumero);
                                     
                                        dueñoAuxiliar.setDireccion(otraDireccion);
                  
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el nuevo teléfono del dueño ");
                                      
                                        long telefono1 = input.nextLong();
                                        dueñoAuxiliar.setTelefono(telefono1);
                        
                                        break;
                                    case 7:
                                        System.out.println("Ingresa la nueva fecha del dueño ");
                                       
                                        String fechaNa= input.nextLine();
                                        dueñoAuxiliar.setFecha(fechaNa);
                     
                                        break;
                                    case 8:
                                        System.out.println("Ingresa el nuevo email del dueño ");
                                      
                                        String email1 = input.nextLine();
                                        dueñoAuxiliar.setEmail(email1);
                                        
                      
                                        break;
                                    case 9:
                                        if(!dueños.isEmpty()){
                                            System.out.println("Guardando datos de operadores...");
                                            archivo.escribeDueño(dueños);
                                            System.out.println("Datos guardados");
                                        }
                                        bandera = false;
                                        System.out.println("Saliendo del sistema...\n Hasta pronto.");
                   
                                        break;

                                    default:
                                        break;

                                    }
                                }


                                break;
                    
                            case 4:
                                if(dueños.size()==0){
                                    System.out.println("No puedes eliminar ya que no hay dueños en la lista");
                                    break;
                                }
                                System.out.println("Ingresa el CURP del dueño que deseas eliminar");
                                int indice=0;
                                try{
                                    String curp= input.nextLine();
                                    for(int i=0;i<dueños.size();i++){
                                        if(dueños.get(i).getCURP().equals(curp)){
                                            indice=i;
                                        }
                                    }
                                    dueños.remove(indice);
                                            
                                }
                                catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa adecuadamente el nombre del operador a eliminar");
                                }


                                break;
					
                            case 5:
                                if(!dueños.isEmpty()){
                                    System.out.println("Guardando datos de operadores...");
                                    archivo.escribeDueño(dueños);
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
                                    
                                String nombrePropio = input.nextLine();                                        
          
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
                                   
                                String email=input.nextLine();
                   
                                        
                                System.out.println("Ingresa el estado donde vive el dueño ");
                                    
                                String estado=input.nextLine();
                                    
                      
                                        
                                System.out.println("Ingresa la calle donde vive el dueño ");
                                    
                                String calle=input.nextLine();
                 
                                       
                                System.out.println("Ingresa el código postal de  donde vive el dueño ");
                                    
                                String cp=input.nextLine();
                 
                                System.out.println("Ingresa  el número de la casa de donde vive el dueño ");
                                   
                                String numero=input.nextLine();
                                Direccion nuevaDireccion = new Direccion(estado,calle,cp,numero);
                                Dueño nuevoDueño = new Dueño(CURP,nombrePropio,apellidoP,apellidoM,nuevaDireccion,telefono,fecha,email);
                                dueños.add(nuevoDueño);
                                System.out.println("Se agrego el nuevo Dueño");
				
				
                                break;
                            case 2:
                                for(int i=0;i<dueños.size();i++){
                                    System.out.println(dueños.get(i).toString());
                                }
                                break;
                    
                            case 3:
                                if(dueños.size()==0){
                                    System.out.println("No puedes editar ya que no hay dueños en la lista");
                                    break;
                                }
                                input.nextLine();
                                System.out.println("Ingresa solamente el  CURP del dueño del que deseas editar información:");
                                String CURPaux = input.nextLine();
                                Dueño dueñoAuxiliar=null;
                                for(int i=0;i<dueños.size();i++){
                                    if( dueños.get(i).getCURP().equals(CURPaux)){
                                        dueñoAuxiliar=dueños.get(i);
                                    }
                                }
                                System.out.println("Ingresa la opción deseada\n" + "1-Editar Nombre \n" + "2-Editar Apellido Paterno\n"
                                                   + "3-Editar Apellido Materno\n" + "4-Editar CURP\n" + "5-Editar direccion\n"+ "6-Editar teléfono\n"+ "7-Editar fecha\n"
                                                   + "8-Editar email\n" + "9-Salir\n");
                                try {
                                    opcion = input.nextInt();
                                } catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa un número como opción");
                                }
                                input.nextLine();
                                if(opcion > 0 && opcion < 10){
                                    switch(opcion){
                                    case 1:
                                        System.out.println("Ingresa los nuevos Nombre(s) del dueño ");
      
                                        String nombreProp = input.nextLine();
                                        dueñoAuxiliar.setNombre(nombreProp);


                                        
                                        break;
                                    case 2:
                                                                                        
                                        System.out.println("Ingresa el nuevo apellido paterno del dueño ");
                                      
                                        String apellidoPat = input.nextLine();
                                        dueñoAuxiliar.setApellidoP(apellidoPat);
                   
                                        break;
                                    case 3:
                                        System.out.println("Ingresa el nuevo apellido materno del dueño ");
                                   
                                        String apellidoMat = input.nextLine();
                                        dueñoAuxiliar.setApellidoM(apellidoMat);
              
                                        break;
                                          
                                    case 4:
                                        System.out.println("Ingresa el nuevo CURP dueño ");
                                       
                                        String CURPD = input.nextLine();
                                        dueñoAuxiliar.setFecha(CURPD);
                     
                                        break;
                                    case 5:
                                        System.out.println("Ingresa la nueva direccion  del dueño ");
                                        System.out.println("Ingresa el nuevo estado donde vive el dueño");
                                        String nuevoEstado=input.nextLine();
                                        System.out.println("Ingresa la nueva calle donde vive el dueño");
                                        String nuevaCalle=input.nextLine();
                                        System.out.println("Ingresa el nuevo código postal donde vive el dueño");
                                        String nuevoCodigo=input.nextLine();
                                        System.out.println("Ingresa el nuevo número de la casa donde vive el dueño");
                                        String nuevoNumero=input.nextLine();
                                        Direccion otraDireccion = new Direccion (nuevoEstado,nuevaCalle,nuevoCodigo,nuevoNumero);
                                     
                                        dueñoAuxiliar.setDireccion(otraDireccion);
                  
                                        break;
                                    case 6:
                                        System.out.println("Ingresa el nuevo teléfono del dueño ");
                                      
                                        long telefono1 = input.nextLong();
                                        dueñoAuxiliar.setTelefono(telefono1);
                        
                                        break;
                                    case 7:
                                        System.out.println("Ingresa la nueva fecha del dueño ");
                                       
                                        String fechaNa= input.nextLine();
                                        dueñoAuxiliar.setFecha(fechaNa);
                     
                                        break;
                                    case 8:
                                        System.out.println("Ingresa el nuevo email del dueño ");
                                      
                                        String email1 = input.nextLine();
                                        dueñoAuxiliar.setEmail(email1);
                                        
                      
                                        break;
                                    case 9:
                                        if(!dueños.isEmpty()){
                                            System.out.println("Guardando datos de operadores...");
                                            archivo.escribeDueño(dueños);
                                            System.out.println("Datos guardados");
                                        }
                                        bandera = false;
                                        System.out.println("Saliendo del sistema...\n Hasta pronto.");
                   
                                        break;

                                    default:
                                        break;

                                    }
                                }



                                break;
                    
                            case 4:
                                if(dueños.size()==0){
                                    System.out.println("No puedes eliminar ya que no hay dueños en la lista");
                                    break;
                                }
                                System.out.println("Ingresa el CURP del dueño que deseas eliminar");
                                int indice=0;
                                try{
                                    String curp= input.nextLine();
                                    for(int i=0;i<dueños.size();i++){
                                        if(dueños.get(i).getCURP().equals(curp)){
                                            indice=i;
                                        }
                                    }
                                    dueños.remove(indice);
                                            
                                }
                                catch (InputMismatchException e) {
                                    input.next();
                                    System.out.println("Ingresa adecuadamente el nombre del operador a eliminar");
                                }




                                break;
					
                            case 5:
                                if(!dueños.isEmpty()){
                                    System.out.println("Guardando datos de operadores...");
                                    archivo.escribeDueño(dueños);
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
