package bucles;

import java.util.Scanner;

public class DoWhileEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Se ejecuta como m�nimo una vez
		int numero;
		do {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Introduce un n� entre 1 y 10");
		numero = lector.nextInt();
		}while(numero<1 || numero > 10);
		
		
		
	}

}
