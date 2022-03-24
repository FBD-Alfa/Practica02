import java.util.ArrayList;
/**
 * Clase que representa una estética veterinaria de Little Friend.
 * @author Aguirre Chavez Alejandra
 * @author Sanchez Urbano Cynthia Lizbeth
 * @version 21/03/2022
 */
public class Mascota{

  //private String curp;
  private int clave;
  private FechaNac fechanac;
  private String nombreDuenio;
  private String nombre;
  private float peso;
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
  public Mascota(int clave,
  String nombreDuenio,
  String nombre,
  FechaNac fechanac,
  float peso,
  String especie,
  String raza) {
            //this.curp = curp ;
            this.clave = clave;
            this.fechanac =fechanac;
            this.nombreDuenio = nombreDuenio;
            this.nombre = nombre;
            this.peso = peso;
            this.especie = especie;
            this.raza = raza;

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
    public FechaNac getFechaNac() {
        return fechanac ;
    }

    /**
     * Modifica la
     * @param clave -- La nueva
     */
    public void setFechaNac(FechaNac fechanac) {
        this.fechanac = fechanac;
    }
    /**
     * Obtiene la
     * @return --
     */
    public String getNombreDuenio() {
        return nombreDuenio ;
    }

    /**
     * Modifica la
     * @param clave -- La nueva
     */
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    /**
     * Obtiene la
     * @return --
     */
    public String getNombre() {
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
    public float getPeso() {
        return peso;
    }

    /**
     * Modifica la
     * @param clave -- La nueva
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    /**
     * Obtiene la
     * @return --
     */
    public String getEspecie() {
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
    public String getRaza() {
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
        return this.clave + "," + this.nombreDuenio + "," + this.nombre + "," +
          this.fechanac.toString() +
        "," + this.peso + "," + this.especie + "," + this.raza;
    }

}
