package ejercicios_tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int numhoras;
		int resultado;
		
		System.out.println("Hola empleado \n INTRODUCE CUANTAS HORAS HAS TRABAJADO");
		numhoras=sc.nextInt();
		
		if (numhoras>=0 && numhoras <= 20) {
			resultado = numhoras*12;
			System.out.println("TU SUELDO ES DE: " + resultado);
		} else if (numhoras>20 && numhoras <=30) {
			resultado = numhoras*15;
			System.out.println("TU SUELDO ES DE " + resultado);
		} else if (numhoras > 30) {
			resultado=numhoras*25;
			System.out.println("TU SUELDO ES DE " + resultado);
		} else {
			System.out.println("DEBES INTRODUCIR UN VALOR VALIDO");
		}
	}

}
