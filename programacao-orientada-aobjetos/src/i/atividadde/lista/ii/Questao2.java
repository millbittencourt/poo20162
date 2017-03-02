package i.atividadde.lista.ii;

import java.util.Scanner;

public class Questao2 {

	void obterNumeros(int[] vet) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 5 números: ");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
	}

	void inverterOrdemNumeros(int[] vet, int[] vetInvertida) {
		int cont = 0;
		for (int i = vet.length; i < 0; i--) {
			vetInvertida[cont] = vet[i];
			cont++;
		}
	}

	void exibirVetores(int[] vet, int[] vetInvertida) {
		System.out.println("O vetor original");
		for (int i = 0; i < vetInvertida.length; i++) {
			System.out.println(vet[i] + " ");
		}
		System.out.println("Vetor invertido: ");
		for (int i = 0; i < vetInvertida.length; i++) {
			System.out.println(vetInvertida[i] + " ");
		}

	}

	public static void main(String[] args) {
		Questao2 q2 = new Questao2();
		int vet[] = new int[5];
		int vetInvertida[] = new int[5];
		q2.obterNumeros(vet);
		q2.inverterOrdemNumeros(vet, vetInvertida);
		q2.exibirVetores(vet, vetInvertida);

	}
}
