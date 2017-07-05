import java.util.Scanner;

/** Programa BANCO
*Francisco Cantor 03072017
**/

public class AppBanco{
	
	public static void main(String []args){
		Scanner lee=new Scanner (System.in);
		Banco bank= new Banco();
		System.out.println("\nCreando 10 clientes... ");
		for (int i=0;i<10;i++){
			bank.addCliente(new Cliente("Cliente"+i,"Apellido Cliente"+i));
			bank.getCliente(i).setCuenta(100+i);
			
		}
		System.out.println("\nHay "+ bank.getNClientes()+" clientes registrados:");
		
		for (int j=0;j<bank.getNClientes();j++){
			System.out.println("\nEl balance del cliente: "+bank.getCliente(j).getNombre()+"es: "+bank.getCliente(j).getCuenta().getBalance());
			
		}
	}
}
