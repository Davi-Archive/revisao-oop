package com.objetos7;

public class Relacionamentos {
//Diagram UML
	public static void main(String[] args) {
		Lutador[] lut = new Lutador[6];

		lut[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, "Leve", 11, 2, 1);
		lut[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, "Leve", 14, 2, 3);
		lut[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, "Médio", 12, 2, 1);
		lut[3] = new Lutador("Deadcode", "Austrália", 28, 1.93, 81.6, "Médio", 13, 0, 2);
		lut[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, "Pesado", 5, 4, 3);
		lut[5] = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, "Pesado", 12, 2, 4);

		Luta UEC01 = new Luta();
		UEC01.marcarLuta(lut[0], lut[1]);
		UEC01.lutar();


		
	}

}
