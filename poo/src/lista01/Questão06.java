package lista01;

import java.util.Scanner;

public class Questão06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] vet1 = new int[10];
		int [] vet2 = new int[10];
		int [] vet3 = new int[10];
		
		System.out.println("Digite 10 valores para o primeiro vetor: ");
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
	
		System.out.println("Digite mais 10 numeros para o segundo vetor: ");
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vet3.length; i++) {
			vet3[i] = vet1[i] + vet2[i];
		}
	
		System.out.println("A soma dos numeros dos dois vetores sera: ");
		for (int i = 0; i < vet3.length; i++) {
			System.out.print(vet3[i]);
		}
	sc.close();
	}
}
