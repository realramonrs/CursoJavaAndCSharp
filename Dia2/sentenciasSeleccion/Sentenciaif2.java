
package sentenciasSeleccion;

import java.util.Scanner;  //PIC

public class Sentenciaif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		int numero ;
		System.out.println("intro un n�mero y te digo si es m�ltiplo de 7:");
		numero = lector.nextInt();
		
		
		
		if(numero % 7 == 0) {
			System.out.println("M�ltiplo de 7");
			
		}
		else {
			System.out.println("No es m�ltiplo de 7");
		}
		
		lector.close();
	}

}
