package testeDoProxyPattern;

import model.Porta;
import model.PortaInterface;
import proxy.PortaProxy;

public class SistemaDeCondominio {
	
	private static Porta porta1;
	private static PortaInterface porta2; 
	/** Note: porta2 é a interface da Classe Controlada(Porta.class). **/
	/** >>Com o Proxy Pattern o cliente deve usar a interface da classe controlada. **/
	
	public static void main(String[] args) {
		String status;
		
		/** ACESSO A PORTA DIRETAMENTE SEM PROXY **/
		porta1 = new Porta();
		
		porta1.abrir();
		status = (porta1.isFechada() ? "Fechada" : "Aberta" );
		System.out.println("A Porta1 está: " + status);
		
		porta1.fechar();
		status = (porta1.isFechada() ? "Fechada" : "Aberta" );
		System.out.println("A Porta1 está: " + status);
		
		System.out.println("\n");
		///////////////////////////////////////////
		
		/** ACESSO A PORTA ATRAVÉS DE PROXY **/
		//Obs: A classe concreta e o proxy implementam a mesma interface, ou seja
		//	   ambos possuem as mesmas assinaturas.
		porta2 = new PortaProxy();/** << A interface porta2 recebe um proxy. **/ 
		
		porta2.abrir();
		status = (porta2.isFechada() ? "Fechada" : "Aberta" );
		System.out.println("A Porta2 está: " + status);
		
		porta2.fechar();
		status = (porta2.isFechada() ? "Fechada" : "Aberta" );
		System.out.println("A Porta2 está: " + status);
		
	}

}
