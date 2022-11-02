package com.objetos7;

import java.util.Objects;
import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private Boolean aprovada;

	public static Random randomize = new Random();

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
			this.setDesafiante(l1);
			this.setDesafiado(l2);
			this.setAprovada(true);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	public void lutar() {
		if (Boolean.TRUE.equals(aprovada)) {
			System.out.println("#### DESAFIADO ####");
			desafiado.apresentar();
			System.out.println("#### DESAFIANTE ####");
			desafiante.apresentar();
			System.out.printf("%n@@ RESULTADO @@%n");
			int vencedor = randomize.nextInt(3);
			switch (vencedor) {
			case 0: // Empate
				desafiante.empatarLuta();
				desafiado.empatarLuta();
				System.out.println("Empatou");
				break;
			case 1: // Desafiado vence
				desafiante.perderLuta();
				desafiado.ganharLuta();
				System.out.println("Vitória do " + desafiado.getNome());
				desafiado.apresentar();
				break;
			case 2: // Desafiante vence
				desafiante.ganharLuta();
				desafiado.perderLuta();
				System.out.println("Vitória do " + desafiante.getNome());
				desafiante.apresentar();
				break;
			default:
				break;

			}
		} else {
			System.out.println("A Luta não pode acontecer.");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public Boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(Boolean aprovada) {
		this.aprovada = aprovada;
	}

}
