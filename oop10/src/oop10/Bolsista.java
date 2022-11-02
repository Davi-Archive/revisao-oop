package oop10;

public class Bolsista extends Aluno {
	private float bolsa;
	public void renovarBolsa() {
		
	}
	
	
	@Override
	public void pagarMensalidade() {
		System.out.println("A mensalidade com desconto paga com desconto de "+this.getBolsa());
	}


	public float getBolsa() {
		return bolsa;
	}


	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}


	@Override
	public String toString() {
		return "Bolsista [bolsa=" + bolsa + "]";
	}
	
	
	
	
}
