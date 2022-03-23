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
    private Mascota [] mascotas= new Mascota [7];
    private Tarjeta tarjeta;

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
    public Estetica(String nombre, String ApellidoP, String ApellidoM, String CURP, Direccion direccion, long telefono, String fecha, String email, Mascotas [] mascotas , Tarjeta tarjeta) {
        this.nombre = nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.CURP = CURP;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fecha = fecha;
        this.email = email;
        this.mascotas = mascotas;
        this.tarjeta = tarjeta;
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
    public long getFecha() {
        return fecha;
    }
    /**
     *
     * @param fecha
     */
    public void setFecha(long fecha) {
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
    /**
     * 
     * @return
     */
    public String getMascotas() {
        return mascotas;
    }
    /**
     *
     * @param mascotas
     */
    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }
    /**
     * 
     * @return
     */
    public Tarjeta getTarjetas() {
        return tarjeta;
    }
    /**
     *
     * @param mascotas
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    @Override
    public String toString() {
        /**
         * FALTA IMPLEMENTAR (Devuelve los atributos en el
        formato del csv).
         */
        return super.toString();
    }
}
