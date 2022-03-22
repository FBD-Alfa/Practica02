
public class PagoFisico extends Pago{
  private boolean targeta = false;
  private boolean efectivo = false;

  private void setEsTargeta(boolean terminalTargeta){
    this.terminalTargeta = terminalTargeta;
  }

  private boolean esTargeta(){
    return terminalTargeta;
  }

  private void setEsEfectivo(boolean efectivo){
    this.efectivo = efectivo;
  }

  private boolean esEfectivo(){
    return efectivo;
  }

}
