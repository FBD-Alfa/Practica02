
public class PagoFisico extends Pago{
  private boolean targeta = false;
  private boolean efectivo = false;

  private void setEsTargeta(boolean targeta){
    this.targeta = targeta;
  }

  private boolean esTargeta(){
    return targeta;
  }

  private void setEsEfectivo(boolean efectivo){
    this.efectivo = efectivo;
  }

  private boolean esEfectivo(){
    return efectivo;
  }

}
