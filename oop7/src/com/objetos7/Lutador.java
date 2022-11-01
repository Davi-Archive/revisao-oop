package com.objetos7;

public class Lutador {
	private String nome, nacionalidade, categoria;
	private double altura, peso;
	private int vitoria, derrota, empate, idade;

	// Constructor
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, String categoria,
			int vitoria, int derrota, int empate) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.categoria = categoria;
		this.vitoria = vitoria;
		this.derrota = derrota;
		this.empate = empate;
	}

	public void apresentar() {
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println(getIdade() + " anos.");
		System.out.println(getAltura() + " de altura.");
		System.out.println("Pesando: " + getPeso());
		System.out.println("Ganhou " + getVitoria());
		System.out.println("Perdeu " + getDerrota());
		System.out.println("Empatou " + getEmpate());

	}

	public void status() {
		System.out.println(getNome());
		System.out.println("É um peso " + getCategoria());
		System.out.println(getVitoria() + " vitorias.");
		System.out.println(getDerrota() + " derrotas.");
		System.out.println(getEmpate() + " empates.");

	}

	public void ganharLuta() {
		setVitoria(getVitoria() + 1);
	}

	public void perderLuta() {
		setDerrota(getDerrota() + 1);
	}

	public void empatarLuta() {
		setEmpate(getEmpate() + 1);
	}

	// Getters and Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.getPeso() < 52.2) {
			this.categoria = "Categoria inválida";
		} else if (this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if (this.getPeso() < 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.getCategoria();
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
