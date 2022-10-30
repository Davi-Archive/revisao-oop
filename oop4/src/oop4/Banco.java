package oop4;

public class Banco {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco(1111, "Jubileu");
		p1.abrirConta("cc");
				
		ContaBanco p2 = new ContaBanco(2222, "Creuza");
		p1.abrirConta("cp");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.estadoAtual();
		p1.estadoAtual();
		
	}

}
