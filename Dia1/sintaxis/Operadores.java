package sintaxis;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Operadores matemáticos: +,-,*, / , % (resto división entera.
		//Operador de asignacion =
		int v1 = 9,v2 = 3;
		int v3 = v1 + v2;
		int v4 = v1*v2;
		
		byte x1 = 3,x2 = 5;
		//Converstiones explícitas (cast)
		byte x3 = (byte)(x1 + x2);
		
		float ejemplo = (float)v2;
		double ejemplo2 = (double)v2;
		System.out.println("v2 como float: " + ejemplo);
		System.out.println("v2 como double: " + ejemplo2);
		double resultado = (float)v2/v1;
		System.out.println(resultado);
		
		
		int resto = v1 % v2;
		System.out.println("El reso de la división entera es: " + resto);
		
		//Más operadores matemáticos : +=,-=, *=, / = 
		
		int n = 5;
		n= n + 1;
		n+=1;
		
		//Operadores incremento ++ y decremento --
		n = 0;
		n++;//Le suma 1 a la n
		++n;
		System.out.println("n = " + n);
		n = ++n;
		System.out.println("n = " + n);
		
		//Operadores relacionales <,<=,>,>= , == , !=
		boolean condicion1 = n > 1;
		boolean condicion2 = n == 1;
		
		//Operadores lógicos : && (Y logico)
		boolean condicion3 = condicion1 && condicion2;
		// || (o lógico)
		boolean condicion4 = condicion1 || condicion2;
		// ! No lógico
		boolean condicion5 = !condicion1;
		
		
		
		
		
	}

}
