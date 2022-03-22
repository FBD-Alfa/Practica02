public class PagoOnline extends Pago{

  private int noTargeta;
  private String vencimiento;

  private void setNoTargeta(int noTargeta){
    this.noTargeta = noTargeta;
  }

  private int getNoTargeta(){
    return noTargeta;
  }

  private void setVencimiento(String vencimiento){
    this.vencimiento = vencimiento;
  }

  private String getVencimiento(){
    return vencimiento;
  }

  /**private String getTitular(){
    return duenio.getNombre();
  }*/

}
