package lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		String nome;
		
		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("DIgite a nota do aluno: ");
		nota = sc.nextInt();
		
		if(nota <= 49){
			System.out.println(nome + " tem rendimento Insuficiente.");
		}
		else if(nota <= 64){
			System.out.println(nome + " tem rendimento Regular.");
		}
		else if(nota <= 84){
			System.out.println(nome + " tem rendimento Bom.");
		}
		else if(nota <= 100){
			System.out.println(nome + " tem rendimento Otimo.");
		}
	sc.close();
	}
}
