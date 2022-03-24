import java.util.ArrayList;
/**
 * Clase que representa un dueño de la veterinaria Little Friend.
 * @author Castro Romero Ares Gael
 * @version 21/03/2022
 */
public class Dueño {
    private String nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String CURP;
    private Direccion direccion;
    private long telefono;
    private String fecha;
    private String email;


    /**
     * @param nombre
     * @param ApellidoP
     * @param ApellidoM
     * @param CURP
     * @param direccion
     * @param telefono
     * @param fecha
     * @param email
     * @param mascotas
     * @param telefono
     * @param tarjeta
     */
    public Dueño(String CURP, String nombre, String ApellidoP, String ApellidoM,  Direccion direccion, long telefono, String fecha, String email) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.email = email;
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
    public String getApellidoP() {
        return ApellidoP;
    }
    /**
     *
     * @param ApellidoP
     */
    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }
    /**
     *
     * @return
     */
    public String getApellidoM() {
        return ApellidoM;
    }
    /**
     *
     * @param ApellidoM
     */
    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    /**
     *
     * @return
     */
    public String getCURP() {
        return CURP;
    }
    /**
     *
     * @param CURP
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
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
     * @param nombre
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
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
    public String getFecha() {
        return fecha;
    }
    /**
     *
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     *
     * @return
     */
    public String geteEmail() {
        return email;
    }
    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
 
    @Override
    public String toString() {
        return this.CURP + "," + this.nombre + "," + this.ApellidoP + "," + this.ApellidoM + "," +this.direccion.toString() + "," + this.telefono + "," +this.fecha + "," + this.email ;
    }
}
