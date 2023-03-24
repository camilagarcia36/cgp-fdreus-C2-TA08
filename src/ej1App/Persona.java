package ej1App;

public class Persona {

	private final char SEXO = 'H';
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(String DNI) {
		this.nombre = "";
		this.edad = 0;
		this.DNI = "53654021N";
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo, String DNI) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = SEXO;
		this.DNI = "53654021N";
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
		this.nombre = "Adri";
		this.edad = 23;
		this.DNI = "53654021N";
		this.sexo = SEXO;
		this.peso = 70;
		this.altura = 1.77;
	}

	public String toString() {
		return "Persona [SEXO=" + SEXO + ", nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}



}
