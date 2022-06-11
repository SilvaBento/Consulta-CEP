package CEPService_pkg;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import java.util.*;

public class Main {
	public static void main(String[] args) throws RemoteException, ServiceException{
		Scanner a = new Scanner(System.in);
		int op;
		String User = "user" ;
		String Senha = "123456" ;
		
		
		System.out.println("Digite: \n 1 - Para localizar pelo CEP\n 2 - Para localizar pelo Endereço");
		op = a.nextInt();
		
		while(op < 1 || op > 2) {
			
			System.out.println("Invalido");
			System.out.println("Digite: \n 1 - Para localizar pelo CEP\n 2 - Para localizar pelo Endereço");
			op = a.nextInt();
			
		}
		
		if (op == 1) {
			
			System.out.println("Digite o CEP");
			String Cep = a.next();
			
			CEPService servico = new CEPServiceLocator();
			CEPServicePort porta = servico.getCEPServicePort();
			System.out.println(porta.obterLogradouroAuth(Cep, User, Senha));	
			
		} else {
			
		System.out.println("Digite o estado");
		String est = a.next();	
			
		System.out.println("Digite o logradouro");
		String Log = a.next();
		
		System.out.println("Digite a cidade");
		String Cid = a.next();
		
		
		CEPService servico = new CEPServiceLocator();
		CEPServicePort porta = servico.getCEPServicePort();
		String esp[] = porta.obterCEPAuth(Log, Cid, est, User, Senha);
		int n = esp.length;
		for (int i = 0; i < n; i++) {
			System.out.println(esp[i]);	
		}
		System.out.println("Numero de consultas realizadas, " + n);	

		}
	}
}
