package lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, res;
		
		System.out.println("Digite um numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		
		res = n1 + n2;
		
		System.out.println("O resultado da adição dos valores é: " + res);
				
		sc.close();
	}
}
