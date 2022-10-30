package oop2;

public class Visibilidade {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo="BIC Cristal";
		c1.cor="azul";
		//c1.ponta=1;
		c1.carga=80;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
	}

}
