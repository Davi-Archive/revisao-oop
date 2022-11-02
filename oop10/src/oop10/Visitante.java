package oop10;

public class Visitante extends Pessoa{

	@Override
	public String toString() {
		return "Visitante [getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
