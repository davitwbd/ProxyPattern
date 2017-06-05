package proxy;

import model.Porta;
import model.PortaInterface;

/** Proxy Pattern - (Funciona como uma ponte)
 *  Defini��o: O Proxy Pattern fornece um substituto ou representante de outro objeto
 *	           para controlar o acesso a ele.
 **/
public class PortaProxy implements PortaInterface {

	private Porta porta = new Porta();/** O Proxy cont�m a classe que deve ser controlada. **/
	
	public boolean isFechada() {
	/** {Nesta parte do codigo deve-se colocar estrat�gias de valida��es, 
	 *   permiss�es ou at� otimiza��es para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
			 
	 /**{Valida��es | Permiss�es | ou outras estrat�gias antes do acesso a classe Porta}**/
		return porta.isFechada();
	}
	
	public void abrir() {
		
	/** {Nesta parte do codigo deve-se colocar estrat�gias de valida��es, 
	 *   permiss�es ou at� otimiza��es para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
		 
	 /**{Valida��es | Permiss�es | ou outras estrat�gias antes do acesso a classe Porta}**/
		System.out.println(" #verifica��es de Seguran�a -> (Antes de Abrir)");
		porta.abrir();
	}

	public void fechar() {
		
	/** {Nesta parte do codigo deve-se colocar estrat�gias de valida��es, 
	 *   permiss�es ou at� otimiza��es para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
		
	 /**{Valida��es | Permiss�es | ou outras estrat�gias antes do acesso a classe Porta}**/
		System.out.println(" #verifica��es de Seguran�a -> (Antes de Fechar)");
		porta.fechar();
	}

}
