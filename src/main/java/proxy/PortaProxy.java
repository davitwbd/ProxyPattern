package proxy;

import model.Porta;
import model.PortaInterface;

/** Proxy Pattern - (Funciona como uma ponte)
 *  Definição: O Proxy Pattern fornece um substituto ou representante de outro objeto
 *	           para controlar o acesso a ele.
 **/
public class PortaProxy implements PortaInterface {

	private Porta porta = new Porta();/** O Proxy contém a classe que deve ser controlada. **/
	
	public boolean isFechada() {
	/** {Nesta parte do codigo deve-se colocar estratégias de validações, 
	 *   permissões ou até otimizações para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
			 
	 /**{Validações | Permissões | ou outras estratégias antes do acesso a classe Porta}**/
		return porta.isFechada();
	}
	
	public void abrir() {
		
	/** {Nesta parte do codigo deve-se colocar estratégias de validações, 
	 *   permissões ou até otimizações para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
		 
	 /**{Validações | Permissões | ou outras estratégias antes do acesso a classe Porta}**/
		System.out.println(" #verificações de Segurança -> (Antes de Abrir)");
		porta.abrir();
	}

	public void fechar() {
		
	/** {Nesta parte do codigo deve-se colocar estratégias de validações, 
	 *   permissões ou até otimizações para depois, de acordo com o caso, 
	 *   acessar e executar os recursos da classe concreta (Porta.class).} **/
		
	 /**{Validações | Permissões | ou outras estratégias antes do acesso a classe Porta}**/
		System.out.println(" #verificações de Segurança -> (Antes de Fechar)");
		porta.fechar();
	}

}
