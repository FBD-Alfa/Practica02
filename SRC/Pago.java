
public class Pago{

  //private Duenio duenio;
  private boolean online = false;
  private boolean fisico = false;
  private int cantidad;

  public void setEsOnline(boolean online){
    this.online = online;
  }

  public boolean esOnline(){
    return online;
  }

  public void setEsFisico(boolean fisico){
    this.fisico = fisico;
  }

  public boolean esFisico(){
    return fisico;
  }

  public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }

  public int cantidad(){
    return cantidad;
  }
}
