package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Programa que aplica un descuento al precio final de la siguiente manera
		//Si el precio < 100€ no hay descuento
		//Si el precio >=100 y < 200 hay un descuenteo del 10%
		//Si el precio >=200 y < 300 descuento del 15%
		//Precios >= 300 descuento de 25%
		
		float precioInicial; //Solicitamos por teclado
		float descuento;
		float precioFinal;
		int n = 0;
		char continuidad;
		
		do {
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Intro precio: ");
		
		precioInicial = lector.nextFloat();
		
		if(precioInicial < 100) {
			descuento = 0;
		}
		else if(precioInicial<200) {
			descuento = precioInicial*0.1f;
		}
		else if(precioInicial < 300) {
			descuento = precioInicial*0.15f;
		}
		
		else {
			descuento = precioInicial*0.25f;
		}
		
		precioFinal = precioInicial - descuento;
		System.out.println("Precio final: " + precioFinal + "€");
		
		System.out.println("Desea meter más productos? s/n");
		continuidad = lector.next().charAt(0);
		}while(continuidad == 's');
		
		
		
	}

}
