package i.atividadde.lista.i;

import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer num1;
		Integer num2;
		Integer soma;

		System.out.println("Digite o primeiro número");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número");
		num2 = sc.nextInt();

		soma = num1 + num2;

		System.out.println("A soma dos números é: " + soma);

	}
}
