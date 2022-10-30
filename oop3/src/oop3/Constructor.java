package oop3;

public class Constructor {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f, true);
		c1.status();

		Caneta c2 = new Caneta("KKK", "Verde", 1.4f, true);
		c2.setTampada(false);
		c2.status();
	}

}
