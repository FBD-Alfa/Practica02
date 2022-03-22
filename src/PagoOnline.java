public class PagoOnline extends Pago{

  private int noTargeta;
  private String vencimiento = "";
  private String titular = "";

  public PagoOnline(int noTargeta, String vencimiento, String titular){
    this.noTargeta = noTargeta;
    this.vencimiento = vencimiento;
    this.titular = titular;
  }

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

  /**public String getTitular(){
    return duenio.getNombre();
  }*/

  public String toString(){
    return noTargeta+","+ vencimiento+","+titular;
  }

}
