
public class PagoFisico extends Pago{

  private boolean tarjeta = false;
  private boolean efectivo = false;
  private String tipoDePago = "";
  private String cliente = "";

  /**
   * Constructor de Pago Fisico.
   * @param cliente, el nombre del cliente a pagar.
   * @param tipoDePago, el tipo de pago "Efectivo" o "Tarjeta".
   */
   public PagoFisico(String cliente, String tipoDePago){
    this.cliente = cliente;
    if (tipoDePago.equals("Efectivo")){
      efectivo = true;
    }else if (tipoDePago.equals("Tarjeta")){
      tarjeta = true;
    }else{
      System.out.println("Ese tipo de pago no es valido.");
      return;
    }
    this.tipoDePago = tipoDePago;
  }

  /**
   * Método setEsTarjeta, cambia el valor booleano de tarjeta.
   * @param boolean, tarjeta.
   */
  public void setEsTarjeta(boolean tarjeta){
    this.tarjeta = tarjeta;
  }

  /**
   * Método getTarjeta.
   * @return boolean, true si es pago con tarjeta.
   */
  public boolean getTarjeta(){
    return tarjeta;
  }

  /**
   * Método setEsEfectivo, cambia el valor booleano de efectivo.
   * @param boolean, efectivo.
   */
  public void setEsEfectivo(boolean efectivo){
    this.efectivo = efectivo;
  }

  /**
   * Método getEfectivo.
   * @return boolean, true si es pago con efectivo.
   */
   public boolean getEfectivo(){
    return efectivo;
  }

  /**
   * Método setCliente, cambia el nombre del cliente.
   * @param String, cliente.
   */
  public void setCliente(String cliente){
    this.cliente = cliente;
  }

  /**
   * Método getCliente.
   * @return String, regresa el nombre del cliente.
   */
   public String getCliente(){
    return cliente;
  }

  /**
   * Método setTipoDePago, cambia el tipo de pago "Efectivo" o "Tarjeta".
   * @param String, tipoDePago.
   */
   public void setTipoDePago(String tipoDePago){
    this.tipoDePago = tipoDePago;
  }

  /**
   * Método getTipoDePago.
   * @return String, regresa el tipo de pago "Efectivo" o "Tarjeta".
   */
   public String getTipoDePago(){
    return tipoDePago;
  }

  /**
   * Método toString.
   * @return String, una representación en cadena de PagoFisico.
   */
  public String toString(){
    return cliente+","+tipoDePago;
  }

}
