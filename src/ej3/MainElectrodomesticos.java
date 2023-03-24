package ej3;

import java.util.Scanner;

public class MainElectrodomesticos {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Electrodomestico e1 = new Electrodomestico();
	Electrodomestico e2 = new Electrodomestico(200, 8);
	
	System.out.println(e1.toString());
	System.out.println(e2.toString());
	
	System.out.println("¿Cual es el precio base del electrodomestico?");
	double precio_base = sc.nextDouble();
	
	System.out.println("¿De qué color es?");
	String color = sc.next();
	color = color.toLowerCase();
	Colores c = Colores.blanco;
	
	switch (color) {
    	case "blanco":
      		c = Colores.blanco;
    		break;

    	case "negro":
    		c = Colores.negro;
    		break;

    	case "rojo":
    		c = Colores.rojo;
    		break;
    		
    	case "azul":
    		c = Colores.azul;
    		break;
    		
    	case "gris":
    		c = Colores.gris;
    		break;

         default:
             System.out.println("El color introducido no es correcto");
             c = Colores.blanco;
             break;
		}
	
	System.out.println("¿Qué tipo de consumo energetico es?");
	String consumo = sc.next();
	consumo = consumo.toUpperCase();
	Consumos cons = Consumos.F;
	
	switch (consumo) {
    	case "A":
      		cons = Consumos.A;
    		break;

    	case "B":
    		cons = Consumos.B;
    		break;

    	case "C":
    		cons = Consumos.C;
    		break;
    		
    	case "D":
    		cons = Consumos.D;
    		break;
    		
    	case "E":
    		cons = Consumos.E;
    		break;
    		
    	case "F":
    		cons = Consumos.F;
    		break;

         default:
             System.out.println("El consumo introducido no es correcto");
             cons = Consumos.F;
             break;
		}
	
	System.out.println("¿Qué peso tiene?");
	double peso = sc.nextDouble();

	Electrodomestico e3 = new Electrodomestico(precio_base, c, cons, peso);
	
	System.out.println(e3.toString());
}
	}

