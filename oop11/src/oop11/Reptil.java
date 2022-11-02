package oop11;

public class Reptil extends Animal{
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Réptil rastejar.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Réptil comeu fruta.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Réptil emitiu um som.");
		
	}
	
}
