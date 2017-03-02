package i.atividadde.lista.i;

import java.util.Random;

public class SomaDeVetores {
	private static final int TM = 10;

	public static void main(String[] args) {
		Random rd = new Random();

		Integer[] vetor1 = new Integer[TM];
		Integer[] vetor2 = new Integer[TM];
		Integer[] vetor3 = new Integer[TM];

		System.out.println(" O primeiro vetor de números aleatórios (0-9) é:");
		for (int i = 0; i < TM; i++) {
			vetor1[i] = rd.nextInt(10);
			System.out.print(vetor1[i] + " ");
		}

		System.out.println("\n O segundo vetor de números aleatórios (0-9) é:");
		for (int i = 0; i < TM; i++) {
			vetor2[i] = rd.nextInt(10);
			System.out.print(vetor2[i] + " ");
		}

		System.out.println("\n A soma dos dois vetores é:");
		for (int i = 0; i < TM; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.print(vetor3[i] + " ");
		}
	}
}
