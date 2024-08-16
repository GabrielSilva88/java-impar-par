/*Escreva um programa que leia um número inteiro do usuário e diga se ele é par ou ímpar.*/

package verificadorImparPar;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Verificador de numero Impar ou Par \n Digite valor numerico");
		int numero = scan.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + "é Par");
		} else {
			System.out.println(numero + "é Impar");
		}

		/*
		 * 		fuciona porém redudante 
		 * 
		 * switch (numero) { case 1: { if(numero % 2 == 0) {
		 * System.out.println(numero + "é Par"); }
		 * 
		 * } default:
		 * 		System.out.println(numero + "é Impar");
		 * }
		 */
	}
}
