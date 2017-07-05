
public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(double ini) {
		super(ini);
		// TODO Auto-generated constructor stub
	}

	public boolean Retiro(double cant){
		boolean r=false;
		if (Balance>=5000){
		Balance=Balance-cant;
		r=true;
		}
		return r;
	}
	
}
