package oop11;

public class Mamifero extends Animal{
	private String corPelo;

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Mamifero correu.");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamifero comeu carne.");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Mamifero emitiu som.");
		
	}
	
	
}
