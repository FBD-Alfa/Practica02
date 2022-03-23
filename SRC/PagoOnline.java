public class PagoOnline extends Pago{

  private int noTarjeta;
  private String vencimiento = "";
  private String titular = "";

  /**
   * Constructor de Pago Fisico.
   * @param int, número de la tarjeta.
   * @param String, el vencimiento de la tarjeta.
   * @param String, el nombre del titular de la tarjeta.
   */
  public PagoOnline(int noTarjeta, String vencimiento, String titular){
    this.noTarjeta = noTarjeta;
    this.vencimiento = vencimiento;
    this.titular = titular;
  }

  /**
   * Método setNoTarjeta, cambia el número de la tarjeta.
   * @param int, el número nuevo de la tarjeta.
   */
  public void setNoTarjeta(int noTarjeta){
    this.noTarjeta = noTarjeta;
  }

  /**
   * Método getNoTarjeta, devuelve el numero de la tarjeta.
   * @return int, el número de la tarjeta.
   */
  public int getNoTarjeta(){
    return noTarjeta;
  }

  /**
   * Método setVencimiento, cambia el vencimiento de la tarjeta.
   * @param String, el nuevo vencimiento de la tarjeta.
   */
  public void setVencimiento(String vencimiento){
    this.vencimiento = vencimiento;
  }

  /**
   * Método getVencimiento, devuelve el vencimiento de la tarjeta.
   * @return String, el vencimiento de la tarjeta.
   */
  public String getVencimiento(){
    return vencimiento;
  }

  /**
   * Método setTitular, cambia el nombre del titular de la tarjeta.
   * @param int, el nombre del nuevo titular de la tarjeta.
   */
  public void setTitular(String titular){
    this.titular = titular;
  }

  /**
   * Método getTitular, devuelve el titular de la tarjeta.
   * @return String, el titular de la tarjeta.
   */
  public String getTitular(){
    return titular;
  }

  /**
   * Método toString, regresa una representación en cadena de PagoOnline.
   * @return String, la representación en cadena del pago online.
   */
   public String toString(){
    return noTarjeta+","+ vencimiento+","+titular;
  }

}
