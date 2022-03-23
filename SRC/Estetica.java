/**
 * Clase que representa una estética veterinaria de Little Friend.
 * @author Jesús Alberto Reyes Gutiérrez
 * @version 21/03/2022
 */
public class Estetica {
    private int clave;
    private String nombre;
    private Direccion direccion;
    private long telefono;
    private String horario;
    private short noConsultorios;

    /**
     * Constructor con todos los atributos.
     * @param clave -- Es la clave de la estética.
     * @param nombre -- Es el nombre de la estética.
     * @param direccion -- Es la dirección de la estética.
     * @param telefono -- Es el teléfono de la estética.
     * @param horario -- Es el horario de servicio de la estética.
     * @param noConsultorios -- Es la cantidad de consultorios de la estética (máximo 4).
     */
    public Estetica(int clave, String nombre, Direccion direccion,
                long telefono, String horario, short noConsultorios) {
        this.clave = clave;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.noConsultorios = noConsultorios;
    }

    /**
     * Obtiene la clave de la estética.
     * @return -- La clave de la estética.
     */
    public int getClave() {
        return clave;
    }

    /**
     * Modifica la clave de la estética.
     * @param clave -- La nueva clave de la estética.
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    /**
     * Obtiene el nombre de la estética.
     * @return -- El nombre de la estética.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la estética.
     * @param nombre -- El nuevo nombre de la estética
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección de la estética.
     * @return -- La dirección de la estética.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección de la estética.
     * @param direccion -- La nueva dirección de la estética.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono de la estética.
     * @return -- El teléfono de la estética.
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono de la estética.
     * @param telefono -- El nuevo teléfono de la estética.
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el horario de la estética.
     * @return -- El horario de la estética.
     */
    public String getHorario() {
        return horario;
    }

    /**
     * Modifica el horario de la estética.
     * @param horario -- El nuevo horario de la estética.
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * Obtiene el número de consultorios de la estética.
     * @return -- El número de consultorios de la estética.
     */
    public short getNoConsultorios() {
        return noConsultorios;
    }

    /**
     * Modifica el número de consultorios de la estética.
     * @param noConsultorios -- El nuevo número de consultorios.
     */
    public void setNoConsultorios(short noConsultorios) {
        this.noConsultorios = noConsultorios;
    }

    /**
     * Método toString de una Estética.
     * @return -- Los atributos de la estética separados por coma en una cadena.
     */
    @Override
    public String toString() {
        return this.clave + "," + this.nombre + "," + this.direccion.toString() +
        "," + telefono + "," + horario + "," + noConsultorios;
    }
}
