/**
 * Clase que representa los datos de la tarjeta con que se realizan los pagos en la   la veterinaria Little Friend.
 * @author Aguirre Chavez Alejandra
 * @version 21/03/2022
 */
public class Tarjeta {
    private String curp;
    private long numero;
    private String titular;
    private int cvv;
    private String vencimiento;
    // Vencimiento objeto


    /**
     * @param numero
     * @param titular
     * @param cvv
     * @param CURP
     */
    public Tarjeta(long numero, String titular,int cvv, String curp, String vencimiento) {
        this.numero = numero;
        this.titular = titular;
        this.cvv = cvv;
        this.curp = curp;
        this.vencimiento =vencimiento;
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
     * @param nombre
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    /**
     * 
     * @return
     */
    public String getTitularP() {
        return titular;
    }
    /**
     *
     * @param Titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
    /**
     * 
     * @return
     */
    public String getCVV() {
        return cvv;
    }
    /**
     *
     * @param CVV
     */
    public void setCVV(String cvv) {
        this.cvv = cvv;
    }
    /**
     * 
     * @return
     */
    public String getCURP() {
        return curp;
    }
    /**
     *
     * @param CURP
     */
    public void setCURP(String curp) {
        this.curp = curp;
    }
    /**
     * 
     * @return
     */
    public Vencimiento getVencimiento() {
        return vencimiento;
    }
    /**
     *
     * @param vencimiento
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
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
