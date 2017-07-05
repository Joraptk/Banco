
public class CuentaCheques extends Cuenta {

	public CuentaCheques(double ini) {
		super(ini);
		// TODO Auto-generated constructor stub
	}
	
	public boolean Retiro(double cant){
		Balance=Balance-cant;
		return true;
	}

}
