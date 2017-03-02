package lista01;

import java.util.Scanner;

public class Questao04 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String alfabeto;
		
		System.out.println("Digite uma letra do alfabeto: ");
		alfabeto = sc.nextLine();
		
		if(alfabeto.equalsIgnoreCase("a")||alfabeto.equalsIgnoreCase("e")
				||alfabeto.equalsIgnoreCase("i")||alfabeto.equalsIgnoreCase("o")||alfabeto.equalsIgnoreCase("u")){
			System.out.println("Letra digitada é uma Vogal.");
		}else
			System.out.println("Letra digitada é uma Consoante");
		
		sc.close();
	}

}
