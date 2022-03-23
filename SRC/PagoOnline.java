public class PagoOnline extends Pago{

  private int noTargeta;
  private String vencimiento = "";
  private String titular = "";

  /**
   * Constructor de Pago Fisico.
   * @param int, número de la targeta.
   * @param String, el vencimiento de la targeta.
   * @param String, el nombre del titular de la targeta.
   */
  public PagoOnline(int noTargeta, String vencimiento, String titular){
    this.noTargeta = noTargeta;
    this.vencimiento = vencimiento;
    this.titular = titular;
  }

  /**
   * Método setNoTargeta, cambia el número de la targeta.
   * @param int, el número nuevo de la targeta.
   */
  public void setNoTargeta(int noTargeta){
    this.noTargeta = noTargeta;
  }

  /**
   * Método getNoTargeta, devuelve el numero de la targeta.
   * @return int, el número de la targeta.
   */
  public int getNoTargeta(){
    return noTargeta;
  }

  /**
   * Método setVencimiento, cambia el vencimiento de la targeta.
   * @param String, el nuevo vencimiento de la targeta.
   */
  public void setVencimiento(String vencimiento){
    this.vencimiento = vencimiento;
  }

  /**
   * Método getVencimiento, devuelve el vencimiento de la targeta.
   * @return String, el vencimiento de la targeta.
   */
  public String getVencimiento(){
    return vencimiento;
  }

  /**
   * Método setTitular, cambia el nombre del titular de la targeta.
   * @param int, el nombre del nuevo titular de la targeta.
   */
  public void setTitular(String titular){
    this.titular = titular;
  }

  /**
   * Método getTitular, devuelve el titular de la targeta.
   * @return String, el titular de la targeta.
   */
  public String getTitular(){
    return titular;
  }

  /**
   * Método toString, regresa una representación en cadena de PagoOnline.
   * @return String, la representación en cadena del pago online.
   */
   public String toString(){
    return noTargeta+","+ vencimiento+","+titular;
  }

}
