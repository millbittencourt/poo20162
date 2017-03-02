package i.atividadde.lista.i;

import java.util.Scanner;

public class VogalOuConsoante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String letra;

		System.out.println("Digite uma letra qualquer. Vou dizer se é vogal ou consoante.");
		letra = sc.nextLine();

		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
				|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("Você digitou uma vogal.");
		} else if (letra.length() > 1) {
			System.out.println("Você digitou mais de uma letra. Digite apenas uma, por favor.");
		} else {
			System.out.println("Você digitou uma consoante.");
		}
	}
}
