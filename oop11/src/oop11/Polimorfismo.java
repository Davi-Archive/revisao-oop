package oop11;

public class Polimorfismo {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		Goldfish goldfish = new Goldfish();
		Arara arara= new Arara();
		
		/*
		 * m.setPeso(80.5f); m.setIdade(2); m.setMembros(4); m.locomover();
		 * m.alimentar(); m.emitirSom();
		 * 
		 * p.setPeso(0.35f); p.setIdade(1); p.setMembros(4); p.locomover();
		 * p.alimentar(); p.emitirSom();
		 * 
		 * a.setPeso(0.89f); a.setIdade(2); a.setMembros(2); a.locomover();
		 * a.alimentar(); a.emitirSom();
		 * 
		 * r.setPeso(5.89f); r.setIdade(12); r.setMembros(4); r.locomover();
		 * r.alimentar(); r.emitirSom();
		 * 
		 */
		
		cachorro.setPeso(80.5f); 
		cachorro.setIdade(2); 
		cachorro.setMembros(4); 
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		
		canguru.setPeso(80.5f); 
		canguru.setIdade(2); 
		canguru.setMembros(4); 
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
	}

}
