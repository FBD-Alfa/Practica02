/**
 * Clase que representa los datos de la tarjeta con que se realizan los pagos en la   la veterinaria Little Friend.
 * @author Aguirre Chavez Alejandra
 * @version 21/03/2022
 */
public class Tarjeta {
    //private String curp;
    private long numero;
    private String titular;
    private int cvv;
    private String vencimiento;



    /**
     * @param numero
     * @param titular
     * @param cvv
     * @param vencimiento

     */
    public Tarjeta(long numero, String titular,int cvv, String vencimiento) {
        this.numero = numero;
        this.titular = titular;
        this.cvv = cvv;
        this.vencimiento =vencimiento;
    }

    /**
     *
     * @return
     */
    public long getNumero() {
        return numero;
    }
    /**
     *
     * @param nombre
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }
    /**
     *
     * @return
     */
    public String getTitular() {
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
    public int getCVV() {
        return cvv;
    }
    /**
     *
     * @param CVV
     */
    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    /**
     *
     * @return
     */
    public String getVencimiento() {
        return vencimiento;
    }
    /**
     *
     * @param vencimiento
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    /**
     * Método toString, regresa una representación en cadena de la targeta.
     * @return String, la representación en cadena de la targeta.
     */
     public String toString(){
      return numero+","+ titular+","+cvv+","+vencimiento;
    }

}
