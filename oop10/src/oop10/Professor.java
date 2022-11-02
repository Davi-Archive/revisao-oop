package oop10;

public class Professor {
	private String especialidade;
	private float salario;

	public void receberAumento(float valor) {
		System.out.println("O salario foi aumentado em " + valor + "e agora é " + this.getSalario());
		this.setSalario(this.getSalario() + valor);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [especialidade=" + especialidade + ", salario=" + salario + "]";
	}

	
	
}
