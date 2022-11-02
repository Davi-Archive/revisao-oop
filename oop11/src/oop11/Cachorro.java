package oop11;

public class Cachorro extends Mamifero {
	public void enterrarOsso() {
		System.out.println("Cachorro enterrou o osso.");
	}
	public void abanarRabo() {
		System.out.println("Cachorro abanou o rabo.");
	}
	
	@Override
	public void locomover() {
		System.out.println("Cachorro correu.");
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cachorro comeu comida.");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro latiu.");
	}
	
	
}
