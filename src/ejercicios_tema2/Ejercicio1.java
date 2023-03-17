package ejercicios_tema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SOLICITA 3 NUMEROS POR TECLADO Y ORDENALOS DE MENOS A MAYOR
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escribe el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo numero");
		int num2=sc.nextInt();
		System.out.println("Escribe el tercer numero");
		int num3=sc.nextInt();
		
		if (num1<num2 && num2<num3) {
			System.out.println(num1 + "<" + num2 + "<" + num3);
		} else if (num2<num1 && num1<num3) {
			System.out.println(num2 + "<" + num1 + "<" + num3);
		} else if (num3<num1 && num1<num2) {
			System.out.println(num3 + "<" + num1 + "<" + num2);
		} else if (num1<num3 && num3<num2) {
			System.out.println(num1 + "<" + num3 + "<" + num2);
		} else if (num2<num3 && num3<num1) {
			System.out.println(num2 + "<" + num3 + "<" + num1);
		} else {
			System.out.println(num3 + "<" + num2 + "<" + num1);
		}
	}

}
