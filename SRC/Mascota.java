import java.util.ArrayList;
/**
 * Clase que representa una estética veterinaria de Little Friend.
 * @author Aguirre Chavez Alejandra 
 * @author Sanchez Urbano Cynthia Lizbeth
 * @version 21/03/2022
 */
public class Mascota{
  
  private String curp;
  private int clave;
  private FechaNac fechanac;
  private Dueño duenio;
  private String nombre;
  private double peso;
  private String especie;
  private String raza;
  
  /**
     * Constructor con todos los atributos.
     * @param curp -- Es la curp del dueño
     * @param clave -- Es la clave de la estética.
     * @param fechanac -- Es la fecha de nacimiento de la mascota.
     * @param duenio -- Datos del dueño.
     * @param nombre -- Es el nombre de la mascota.
     * @param peso -- Es el peso de la mascota.
     * @param especie -- Es la especie de la mascota.
     * @param raza -- Es la raza de la mascota.
     */
  public Mascota(String curp,
  int clave,
  FechaNac fechanac,
  Dueño duenio,
  String nombre,
  double peso,
  String especie,
  String raza) {
            this.curp = curp ;
            this.clave = clave;
            this.fechanac =fechanac;
            this.duenio = duenio;
            this.nombre = nombre;
            this.peso = peso;
            this.especie = especie;
            this.raza = raza;

    }
  
  /**
     * Obtiene la 
     * @return -- 
     */
    public String getCURP() {
        return curp;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setCURP(String curp) {
        this.curp = curp;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getClave() {
        return clave;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getFechaNac() {
        return fechaNac ;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setFechaNac(FechaNac fechaNac) {
        this.fechaNac = fechaNac;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getDueño() {
        return duenio ;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setDueño(Dueño duenio) {
        this.duenio = duenio;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getNombre() {
        return nombre;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getEspecie() {
        return especie;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    /**
     * Obtiene la 
     * @return -- 
     */
    public int getRaza() {
        return raza;
    }

    /**
     * Modifica la 
     * @param clave -- La nueva 
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
  
   /**
     * Método toString de Mascota
     * @return -- Los atributos de la mascota separados por coma en una cadena.
     */
    @Override
    public String toString() {
        return this.clave + "," + this.nombre + "," + this.duenio.toString() + "," +
          this.fechanac.toString() + 
        "," + this.peso + "," + this.especie + "," + this.raza;
    }
  
}
