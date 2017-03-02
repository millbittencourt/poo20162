package lista01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome, sobrenome;
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = sc.nextLine();
		
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
		
		sc.close();
	}
}
