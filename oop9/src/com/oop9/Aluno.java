package com.oop9;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;

	public void cancelarMatr() {
		if (matricula != 0) {
			this.setMatricula(0);
			System.out.println("Já está cancelada");
		} else {
			System.out.println("Matricula foi cancelada");
		}

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
