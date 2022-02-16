package bucles;

public class ForEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Algoritmo que determina si un n�mero es perfecto
		//1. Sumar los divisores del n�mero , excepto el mismo
		//2. Si la suma = numero --> Perfecto
		
		int numero = 29;
		int suma = 0;
		
		for(int i = 1;i<numero;i++) {
			if(numero % i == 0) {
				suma = suma + i;				
			}
		}
		if(suma == numero) {
			System.out.println("N�mero perfecto");
		}
		else {
			System.out.println("Numero no perfecto.");
		}
		
		
		
	}

}
