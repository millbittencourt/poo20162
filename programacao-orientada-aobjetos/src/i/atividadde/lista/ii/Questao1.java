package i.atividadde.lista.ii;

import java.util.Scanner;

public class Questao1 {

	void obterNumeros(int[] vet) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe 5 números");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}

	}

	int encontrarMaiorNumero(int[] vet) {
		int maior = vet[0];
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
			}
		}
		return maior;
	}

	void exibirMaiorNumero(int maior) {
		System.out.println("O maior número é: " + maior);
	}

	public static void main(String[] args) {
		int[] vet = new int[5];
		Questao1 q1 = new Questao1();

		q1.obterNumeros(vet);
		int maior = q1.encontrarMaiorNumero(vet);
		q1.exibirMaiorNumero(maior);

	}

}
