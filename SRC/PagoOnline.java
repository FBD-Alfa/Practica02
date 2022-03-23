/**
 * Clase que maneja los pagos online de Little Friend.
 * @author Sánchez Urbano Cynthia Lizbeth
 * @version 21/03/2022
 */
public class PagoOnline extends Pago{

  private Tarjeta tarjeta;

  /**
   * Constructor de Pago Fisico.
   * @param int, número de la tarjeta.
   * @param String, el vencimiento de la tarjeta.
   * @param String, el nombre del titular de la tarjeta.
   */
  public PagoOnline(long numero,String titular,int cvv,String vencimiento, int cantidad){
    tarjeta = new Tarjeta(numero, titular, cvv, vencimiento);
    setCantidad(cantidad);
  }

  /**
   * Método setTarjeta, la tarjeta.
   * @param tarjeta, la nueva tarjeta.
   */
  public void setTarjeta(Tarjeta tarjeta){
    this.tarjeta = tarjeta;
  }

  /**
   * Método getTarjeta, devuelve la tarjeta.
   * @return Tarjeta, la tarjeta.
   */
  public Tarjeta getTarjeta(){
    return tarjeta;
  }



  /**
   * Método toString, regresa una representación en cadena de PagoOnline.
   * @return String, la representación en cadena del pago online.
   */
   public String toString(){
    return tarjeta.toString()+","+getCantidad();
  }

}
