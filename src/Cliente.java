/** Programa cliente
*Francisco Cantor 03072017
**/

public class Cliente {
  private String Nombre;
  private String Apellido;
  private Cuenta cuenta;

  public Cliente (String N, String A){
  Nombre=N;
  Apellido=A;
  
  }
  
  public String getNombre(){
  return Nombre;
  }

  public String getApellido(){
  return Apellido;
  }
  
  public void setCuenta(double val){  
	  cuenta=new Cuenta(val);
  }
  
 public Cuenta getCuenta(){
	 return cuenta;
	 
 }

 }