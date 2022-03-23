
public class PagoFisico extends Pago{

  private boolean targeta = false;
  private boolean efectivo = false;
  private String tipoDePago = "";
  private String cliente = "";

  /**
   * Constructor de Pago Fisico.
   * @param cliente, el nombre del cliente a pagar.
   * @param tipoDePago, el tipo de pago "Efectivo" o "Targeta".
   */
   public PagoFisico(String cliente, String tipoDePago){
    this.cliente = cliente;
    if (tipoDePago.equals("Efectivo")){
      efectivo = true;
    }else if (tipoDePago.equals("Targeta")){
      targeta = true;
    }else{
      System.out.println("Ese tipo de pago no es valido.");
      return;
    }
    this.tipoDePago = tipoDePago;
  }

  /**
   * Método setEsTargeta, cambia el valor booleano de targeta.
   * @param boolean, targeta.
   */
  public void setEsTargeta(boolean targeta){
    this.targeta = targeta;
  }

  /**
   * Método getTargeta.
   * @return boolean, true si es pago con targeta.
   */
  public boolean getTargeta(){
    return targeta;
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
   * Método setTipoDePago, cambia el tipo de pago "Efectivo" o "Targeta".
   * @param String, tipoDePago.
   */
   public void setTipoDePago(String tipoDePago){
    this.tipoDePago = tipoDePago;
  }

  /**
   * Método getTipoDePago.
   * @return String, regresa el tipo de pago "Efectivo" o "Targeta".
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
