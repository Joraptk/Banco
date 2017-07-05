/** Programa que tiene un balance, puede hacer depositos y retiros
*Francisco Cantor 03072017
**/

public class Cuenta{

protected double Balance;

	public Cuenta(double ini){
	Balance=ini;
	}
	public double getBalance(){
		return (Balance);
	}
	
	public boolean Retiro(double cant){		
		if(Balance>=cant){
		Balance=Balance-cant;
		return true;
		}else{
		return false;	
		}
	}
	
	public void Deposito(double cant){
		Balance=Balance+cant;
	}

}


