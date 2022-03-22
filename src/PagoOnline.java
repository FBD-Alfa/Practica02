public class PagoOnline extends Pago{

  private int noTargeta;
  private String vencimiento = "";
  private String titular = "";

  public PagoOnline(int noTargeta, String vencimiento, String titular){
    this.noTargeta = noTargeta;
    this.vencimiento = vencimiento;
    this.titular = titular;
  }

  public void setNoTargeta(int noTargeta){
    this.noTargeta = noTargeta;
  }

  public int getNoTargeta(){
    return noTargeta;
  }

  public void setVencimiento(String vencimiento){
    this.vencimiento = vencimiento;
  }

  public String getVencimiento(){
    return vencimiento;
  }

  public void setTitular(String titular){
    this.titular = titular;
  }

  public String getTitular(){
    return titular;
  }

  public String toString(){
    return noTargeta+","+ vencimiento+","+titular;
  }

}
