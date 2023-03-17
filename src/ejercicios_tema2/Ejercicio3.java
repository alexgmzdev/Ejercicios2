package ejercicios_tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int resultado;
		
		System.out.println("Introduce un numero para hacer su tabla de multiplicar");
		int number1 = sc.nextInt();
		for (int i=1; i<=10; i++) {
			System.out.println(number1 +" x "+ i + " = " + (resultado=number1*i));
		}
	}

}
