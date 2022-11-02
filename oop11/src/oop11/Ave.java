package oop11;

public class Ave extends Animal {
	private String corPena;
	public void fazerNinho() {
		System.out.println("Ave fez ninho.");
	}
	
	
	public String getCorPena() {
		return corPena;
	}


	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}


	@Override
	public void locomover() {
		System.out.println("Pássaro voou.");
		
	}
	@Override
	public void alimentar() {
		System.out.println("Avé comeu folhas.");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Ave cantou.");
		
	}
}
