package ej2;

import java.util.Random;

public class Password {

	private int longitud;
	private String contraseña = "";
	Random claseRandom = new Random();
	
	public Password () {
		this.longitud = 8;
		this.contraseña = "12345678";
	}
	
	public Password (int longitud) {
		this.longitud = longitud;
		
		for(int i = 0; i < longitud; i++) {
			contraseña += Integer.toString(claseRandom.nextInt(8));
		}
		
		this.contraseña = contraseña;
	}

	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
}

