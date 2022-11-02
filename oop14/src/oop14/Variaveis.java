package oop14;

public class Variaveis {

	public static class Varia {
		public static int x; //static, will change, and can be accessed
		public int y;  

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Varia a = new Varia();
			Varia b = new Varia();
			a.y = 5;
			b.y = 6;
			a.x = 1;
			b.x = 2;
			System.out.println(a.y);
			System.out.println(b.y);
			System.out.println(a.x);
			System.out.println(b.x);
		}

	}

}
