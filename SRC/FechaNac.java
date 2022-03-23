/**
 * Clase que representa la Fecha de Nacimiento del dueño de la mascota
 * @author Alejandra Aguirre Chavez
 * @version 21/03/2022
 */
public class FechaNac {
      private int dia;
      private String mes;
      private int año;

    /**
     * Constructor con todos los atributos.
     * @param dia -- El dia en que nació el dueño.
     * @param mes -- El mes de nacimiento del dueño.
     * @param año -- Año de nacimiento del dueño.
     */
    public FechaNac( int dia, String mes; int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /**
     * Método que obtiene el estado en el que se encuentra la 
     * @return -- Estado en el que se encuentra la 
     */
    public int getDia() {
        return dia;
    }

    /**
     * Método que modifica el estado de la 
     * @param 
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * Método que obtiene el estado en el que se encuentra la 
     * @return -- Estado en el que se encuentra la 
     */
    public String getMes() {
        return mes;
    }

    /**
     * Método que modifica el estado de la 
     * @param 
     */
    public void setMes(String mes) {
        this.mes = mes;
    }
        /**
     * Método que obtiene el estado en el que se encuentra la 
     * @return -- Estado en el que se encuentra la 
     */
    public int getAño() {
        return año;
    }

    /**
     * Método que modifica el estado de la 
     * @param 
     */
    public void setAño(int año) {
        this.año = año;
    }
    
    
    /**
     * Método toString de una fecha de nacimiento
     * @return -- Los datos de la fecha de nacimiento son separados por comas en una cadena. 
     */
    @Override
   public String toString(){
     return dia+","+mes+","+año;
  }
    }
}
