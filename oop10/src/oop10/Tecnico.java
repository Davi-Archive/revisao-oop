package oop10;

public class Tecnico extends Aluno{
	private int registroProfissional;
	private int exercicios;
	
	public void praticar() {
		System.out.println("Praticando exercícios pela "+this.exercicios++ +" vez");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	public int getExercicios() {
		return exercicios;
	}

	public void setExercicios(int exercicios) {
		this.exercicios = exercicios;
	}

	@Override
	public String toString() {
		return "Tecnico [registroProfissional=" + registroProfissional + ", exercicios=" + exercicios
				+ ", getMatricula()=" + getMatricula() + ", getCurso()=" + getCurso() + ", toString()="
				+ super.toString() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSexo()="
				+ getSexo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
}
