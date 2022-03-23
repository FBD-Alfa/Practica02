/**
 * Clase que representa una estética veterinaria Little Friend.
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
     * 
     * @param clave
     * @param nombre
     * @param direccion
     * @param telefono
     * @param horario
     * @param noConsultorios
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
     * 
     * @return
     */
    public int getClave() {
        return clave;
    }

    /**
     * 
     * @param clave
     */
    public void setClave(int clave) {
        this.clave = clave;
    }
    
    /**
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return
     */
    public String getHorario() {
        return horario;
    }

    /**
     * 
     * @param horario
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * 
     * @return
     */
    public short getNoConsultorios() {
        return noConsultorios;
    }

    /**
     * 
     * @param noConsultorios
     */
    public void setNoConsultorios(short noConsultorios) {
        this.noConsultorios = noConsultorios;
    }

    @Override
    public String toString() {
        return this.clave + "," + this.nombre + "," + this.direccion.toString() +
        "," + telefono + "," + horario + "," + noConsultorios;
    }
}
