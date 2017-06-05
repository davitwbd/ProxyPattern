package model;

public class Porta implements PortaInterface {

	private boolean fechada;

	public boolean isFechada() {
		return fechada;
	}

	public void abrir() {
		this.fechada = false;
	}

	public void fechar() {
		this.fechada = true;
	}
	
}
