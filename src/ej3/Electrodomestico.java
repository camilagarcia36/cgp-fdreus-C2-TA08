package ej3;

public class Electrodomestico {
	private final static double PRECIO = 100;
	private final static Colores COLOR = Colores.blanco;
	private final static Consumos CONSUMO = Consumos.F;
	private final double PESO = 5;
	
	private double precio_base;
	private Colores color;
	private Consumos consumo_energetico;
	private double peso;
	
	public Electrodomestico() {
		this.precio_base = PRECIO;
		this.color = COLOR;
		this.consumo_energetico = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(double precio_base, double peso) {
		this.precio_base = precio_base;
		this.color = COLOR;
		this.consumo_energetico = CONSUMO;
		this.peso = peso;
	}
	
	public Electrodomestico(double precio_base, Colores color, Consumos consumo_energetico, double peso) {
		this.precio_base = precio_base;
		this.color = color;
		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
}