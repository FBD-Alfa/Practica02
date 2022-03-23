
public class FechaNac{
  private int dia;
  private String mes;
  private int año;

  public FechaNac(int dia, String mes, int año){
    this.dia = dia;
    this.mes = mes;
    this.año = año;
  }

  public String toString(){
    return dia+","+mes+","+año;
  }
}
