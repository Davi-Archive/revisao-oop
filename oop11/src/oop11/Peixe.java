package oop11;

public class Peixe extends Animal {
	private String corEscama;
	public void soltarBolha() {
		System.out.println("Peixe soltou bolha.");
	}
		
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Peixe nadou.");
		
	}
	@Override
	public void alimentar() {
		System.out.println("Peixe se alimentou.");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Peixe emitiu som.");
		
	}
}
