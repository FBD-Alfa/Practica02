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
     * Constructor con todos los atributos.
     * @param estado -- El estado de la dirección.
     * @param calle -- Calle de la dirección.
     * @param cp -- Código postal de la dirección.
     * @param numero -- Número de la dirección.
     */
    public Direccion(String estado, String calle, String cp, String numero) {
        this.estado = estado;
        this.calle = calle;
        this.cp = cp;
        this.numero = numero;
    }

    /**
     * Método que obtiene el estado en el que se encuentra la dirección.
     * @return -- Estado en el que se encuentra la dirección.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método que modifica el estado de la dirección.
     * @param estado -- El nuevo estado de la dirección.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que obtiene la calle de la dirección.
     * @return -- La calle de la dirección.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Método que modifica la calle de la dirección.
     * @param calle -- La nueva calle de la dirección.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Método que obtiene el código postal de la dirección.
     * @return -- El código postal de la dirección.
     */
    public String getCp() {
        return cp;
    }

    /**
     * Método que modifica el código postal de la dirección.
     * @param cp -- El nuevo código postal de la dirección.
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * Método que obtiene el número de la dirección.
     * @return -- El número de la dirección.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método que modifica el número de la dirección.
     * @param numero -- El nuevo número de la dirección.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método toString de una dirección.
     * @return -- Los datos de la dirección separados por comas en una cadena. 
     */
    @Override
    public String toString() {
        return this.estado + "," + this.calle + "," + this.cp + "," + this.numero;
    }
}