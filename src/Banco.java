/** Programa BANCO
*Francisco Cantor 03072017
**/

public class Banco{
	private Cliente clientes[];
	private int nClientes;
	
	public Banco (){
		nClientes=0;
		clientes=new Cliente[10];
	}
	
	public void addCliente(Cliente cliente){
		clientes[nClientes]=cliente;
		clientes[nClientes].setCuenta(5000.0);
		nClientes++;
	}
	
	public int getNClientes(){
		return nClientes;
	}
	
	public Cliente getCliente(int n){
		return clientes[n];
	}
}