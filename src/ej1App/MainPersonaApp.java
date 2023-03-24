package ej1App;

public class MainPersonaApp {
	public static void main(String[] args) {
		Persona p1 = new Persona("53654021N");
		Persona p2 = new Persona("Adri", 23, 'H', "53654021N");
		Persona p3 = new Persona("Adri", 23, "53654021N", 'H', 70, 1.77);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}

}

