package oop3;

public class Caneta {
	public String modelo;
	float ponta;
	Boolean tampada;
	String cor;

	public Caneta(String modelo, String cor, float ponta, Boolean tampada) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}

	public void status() {
		System.out.printf("%nO modelo é %s %n", this.getModelo());
		System.out.println("A ponta é " + this.getPonta());
		System.out.println("A caneta esta tampada " + this.getTampada());
		System.out.println("A cor da caneta é " + this.getCor());
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public Boolean getTampada() {
		return tampada;
	}

	public void setTampada(Boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
