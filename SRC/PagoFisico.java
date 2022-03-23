
public class PagoFisico extends Pago{
  private boolean targeta = false;
  private boolean efectivo = false;
  private String tipoDePago = "";
  private String cliente = "";

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

  public void setEsTargeta(boolean targeta){
    this.targeta = targeta;
  }

  public boolean getTargeta(){
    return targeta;
  }

  public void setEsEfectivo(boolean efectivo){
    this.efectivo = efectivo;
  }

  public boolean getEfectivo(){
    return efectivo;
  }

  public void setCliente(String cliente){
    this.cliente = cliente;
  }

  public String getCliente(){
    return cliente;
  }

  public void setTipoDePago(String tipoDePago){
    this.tipoDePago = tipoDePago;
  }

  public String getTipoDePago(){
    return tipoDePago;
  }

  public String toString(){
    return cliente+","+tipoDePago;
  }

}
