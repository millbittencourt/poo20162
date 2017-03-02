package lista02;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {
	
	public static Scanner sc = new Scanner(System.in);
	public static int[] vet = new int[5];

	public static void main(String[] args) {
		obterNumeros(vet);
		inverterOrdemNumeros(vet);
		exibirValores(vet);
	}

	public static void obterNumeros(int[] vet){
		System.out.println("Digite 5 numeros: ");
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
	}

	public static void inverterOrdemNumeros(int[] vet){
		Arrays.sort(vet);
	}

	public static void exibirValores(int[] vet){
		System.out.print("O vetor ordenado será: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print( vet[i] + " ");
		}
	}
}
