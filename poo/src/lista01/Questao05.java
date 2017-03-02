package lista01;

import java.util.Scanner;

public class Questao05 {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Integer n;
		Long fatorial;
		Double e;

		do {
			System.out.println("Informe um número maior que zero:");
			n = sc.nextInt();
			if (n <= 0) {
				System.out.println("Número não válido!");
			}
		} while (n <= 0);

		e = 0d;
		for (int i = 0; i <= n; i++) {
			fatorial = calcularFatorial(i);
			e += 1. / fatorial; 
		}

		System.out.println("E = " + e);
	}

	private static Long calcularFatorial(Integer x) {
		Long fat;

		fat = 1L;
		for (int i = 1; i <= x; i++) {
			fat *= i; 
		}
		return fat;
	}

}


