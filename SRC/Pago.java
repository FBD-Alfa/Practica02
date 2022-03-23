/**
 * Clase Pago
 */
public class Pago{

  /* Variable online tipo boolean.*/
  private boolean online = false;
  /* Variable fisico tipo boolean.*/
  private boolean fisico = false;
  /* Variable cantidad tipo int, la cantidad a pagar.*/
  private int cantidad;

  /**
   * Método setEsOnline,
   * @param online, boolean.
   */
  public void setEsOnline(boolean online){
    this.online = online;
  }

  /**
   * Método esOnline,
   * @return boolean, true si es online.
   */
  public boolean esOnline(){
    return online;
  }

  /**
   * Método setEsFisico,
   * @param fisico, boolean.
   */
  public void setEsFisico(boolean fisico){
    this.fisico = fisico;
  }

  /**
   * Método esFisico,
   * @return boolean, true si es fisico.
   */
   public boolean esFisico(){
    return fisico;
  }

  /**
   * Método setCantidad, cambia la cantidad por una nueva.
   * @param cantidad, int.
   */
   public void setCantidad(int cantidad){
    this.cantidad = cantidad;
  }

  /**
   * Método getCantidad,
   * @return int, la cantidad a pagar.
   */
  public int getCantidad(){
    return cantidad;
  }
}
