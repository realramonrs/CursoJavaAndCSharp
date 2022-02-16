package matrices;

import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []matriz = new int[20];
		matriz[0] = 10;
		matriz[1] = 3;
		matriz[9] = 6;
		//Posición cero
		System.out.println(matriz[0]);
		System.out.println(matriz[19]);
		
		for(int i = 0;i<20;i++) {
			System.out.print(matriz[i]+" ");
		}
		//La media de los elementos de la matriz
		
		int matrizAleatoria[] = new int[35];
		Random generador = new Random();
		for(int i = 0;i<matrizAleatoria.length;i++) {
			matrizAleatoria[i] = generador.nextInt(10);
					
		}
		System.out.println();
		System.out.println("Matriz con valores aleatorios:");
		//Visualizar la matriz generada
		for(int i = 0;i<matrizAleatoria.length;i++) {
			System.out.print(matrizAleatoria[i] + " ");
		}
		
		int sumaAleatorios = 0;
		double media = 0;
		
		for(int i = 0;i< matrizAleatoria.length;i++) {
			sumaAleatorios = sumaAleatorios + matrizAleatoria[i];
		}
		
		media = sumaAleatorios/matrizAleatoria.length;
		
		
		
	}

}
