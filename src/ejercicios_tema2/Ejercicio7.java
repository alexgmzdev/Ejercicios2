package ejercicios_tema2;

import java.util.Scanner;
/**
 * 
 * @author Alejandro hola
 * @see ejercicio2
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		String ope;
		int number1;
		int number2;
		double resultado;
		
		System.out.println("BIENVENIDO A LA APP CALCULATOR");
		System.out.println("QUE TIPO DE OPERACION QUIERES REALIZAR?");
		System.out.println("SUMA - DIVISION - POTENCIAT1 - POTENCIAT2");
		
		ope=sc.nextLine();
		
		switch (ope.toUpperCase()) {
		
		case "SUMA":
			System.out.println("Introduce el primer numero");
			number1=sc.nextInt();
			System.out.println("Introduce el segundo numero");
			number2=sc.nextInt();
			System.out.println("LA SUMA ES " + number1 + " + " + number2 + " = " + (resultado=number1+number2));
			break;
		
		case "DIVISION":
			System.out.println("Introduce el primer numero");
			number1=sc.nextInt();
			System.out.println("Introduce el segundo numero");
			number2=sc.nextInt();
			System.out.println("LA DIVISION ES " + number1 + " + " + number2 + " = " + (resultado=number1/number2));
			break;
		
		case "POTENCIAT1":
			System.out.println("Introduce el un numero");
			number1=sc.nextInt();
			System.out.println("EL RESULTADO DE LA POTENCIA ES= " +(resultado=Math.pow(number1, number1)));
			break;
		
		case "POTENCIAT2":
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
			break;
		
		default:
			System.out.println("DEBES INTRODUCIR UNA DE ESAS OPCIONES");
			break;
		}
	}

}
