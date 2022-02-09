package sentenciasSeleccion;

import java.util.Scanner;

public class SentenciaSwtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char opcion;
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca una opción: ");
		System.out.println("a.Sumar dos números.");
		System.out.println("b. Pasar a binario.");
		System.out.println("c. Calcular raiz cuadrada.");
		
		opcion = lector.next().charAt(0);
		
		switch(opcion) {
			case 'a':
				int n1 = 5,n2 =10;
				int suma = n1 + n2;
				System.out.println("suma = " + suma);
				break;
			case 'b':
				int n3 = 256;
				String binario = Integer.toBinaryString(n3);
				System.out.println(n3 + " en binario = " + binario);
				break;
			case 'c':
				int n4 = 45;
				double raiz = Math.sqrt(n4);
				System.out.println("raiz : " + raiz);
				
				break;
			default:
				System.out.println("Opción errónea.");
				break;
		}
		
		
		System.out.println("Más código después del switch");
	}

}
