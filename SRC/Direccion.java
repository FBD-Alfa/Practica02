/**
 * Clase que representa una dirección en México.
 * @author Jesús Alberto Reyes Gutiérrez
 * @version 21/03/2022
 */
public class Direccion {
    private String estado;
    private String calle;
    private String cp;
    private String numero;

    /**
     * 
     * @param estado
     * @param calle
     * @param cp
     * @param numero
     */
    public Direccion(String estado, String calle, String cp, String numero) {
        this.estado = estado;
        this.calle = calle;
        this.cp = cp;
        this.numero = numero;
    }

    /**
     * 
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * 
     */
    public String getCalle() {
        return calle;
    }

    /**
     * 
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * 
     * @return
     */
    public String getCp() {
        return cp;
    }

    /**
     * 
     * @param cp
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * 
     * @return
     */
    public String getNumero() {
        return numero;
    }

    /**
     * 
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
}