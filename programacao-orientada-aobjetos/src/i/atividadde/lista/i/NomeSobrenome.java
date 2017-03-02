package i.atividadde.lista.i;

import java.util.Scanner;

public class NomeSobrenome {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String nome;
		String sobrenome;
		String nomeComp;

		System.out.println("Digite o seu nome");
		nome = sc.next();
		System.out.println("Digite o seu sobrenome");
		sobrenome = sc.next();
		
		nomeComp = nome+" "+sobrenome;
		
		System.out.println(nomeComp);
	}
}
