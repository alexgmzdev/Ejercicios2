package ejercicios_tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
	int eleccion;
	int number1;
	int number2;
	double resultado;
	
		System.out.println("¿QUE TIPO DE OPERACION QUIERES REALIZAR?");
		System.out.println("SUMA(1) - DIVISION(2) - POTENCIA(3) - POTENCIAT2(4)");
		eleccion=sc.nextInt();
		
		if(eleccion==1) {
			System.out.println("Introduce el primer numero");
			number1=sc.nextInt();
			System.out.println("Introduce el segundo numero");
			number2=sc.nextInt();
			System.out.println("LA SUMA ES " + number1 + " + " + number2 + " = " + (resultado=number1+number2));
		} else if (eleccion==2){
			System.out.println("Introduce el primer numero");
			number1=sc.nextInt();
			System.out.println("Introduce el segundo numero");
			number2=sc.nextInt();
			System.out.println("LA DIVISION ES " + number1 + " + " + number2 + " = " + (resultado=number1/number2));
		} else if (eleccion==3) {
			System.out.println("Introduce el un numero");
			number1=sc.nextInt();
			System.out.println("EL RESULTADO DE LA POTENCIA ES= " +(resultado=Math.pow(number1, number1)));
		} else if (eleccion==4) {
			System.out.println("Introduce el primer numero");
			number1=sc.nextInt();
			System.out.println("Introduce el numero del exponente");
			number2=sc.nextInt();
			if(number2 > 0) {
				System.out.println("EL RESULTADO DE LA POTENCIA ES= " +(resultado=Math.pow(number1, number2)));
			} else if (number2==0) {
				System.out.println("EL RESULTADO DE LA POTENCIA ES= " +(resultado=Math.pow(number1, number2)));
			} else if (number2<0) {
				System.out.println("EL RESULTADO DE LA POTENCIA ES= " +(resultado=Math.pow(number1, number2)));
			}
		}
		else {
			System.out.println("DEBES INTRODUCIR UNA DE ESAS OPCIONES");
		}
	}
}
