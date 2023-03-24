package ej4;

public class MainSerie {
	public static void main(String[] args) {
		Serie s1 = new Serie();
		Serie s2 = new Serie("Lost", "JJ Abrams");
		Serie s3 = new Serie("Cobra Kai", 4, "Accion", "Jon Hurwitz");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}