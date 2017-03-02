package lista02;

import java.util.Scanner;

public class Questao01 {
	
	public static Scanner sc = new Scanner(System.in);
	public static int [] vet = new int[5];
	public static int maior = 0;
	public static void main(String[] args) {
	
		obterNumeros(vet);
		encontrarMaiorNumero(vet);
		exibirMaiorNumero(maior);
	}

	public static void obterNumeros(int[] vet){
		System.out.println("Informe 5 numeros.");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
	}
	
	public static int encontrarMaiorNumero(int[] vet){
		
		
		for (int i = 0; i < vet.length; i++) {
			if(vet[i] > maior){
				maior = vet[i];
			}
		}
		return maior; 
	}
	
	public static void exibirMaiorNumero(int maior){
		System.out.println("O maior numero do vetor é: " + maior);
	}
}
