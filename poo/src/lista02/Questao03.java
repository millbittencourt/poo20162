package lista02;

import java.util.Scanner;

public class Questao03 {
	
	public static Scanner sc = new Scanner(System.in);
	public static int num = 0;
	public static boolean situacaoPrimo;
	public static void main(String[] args) {
		obterNumero();
		verificarNumeroPrimo(num);
		exibirResulado(num,situacaoPrimo);
	}

	public static int obterNumero(){
		System.out.println("Digite um numero maior ou igual a zero: ");
		num = sc.nextInt();
		
		return num;
	}

	public static boolean verificarNumeroPrimo(int num){
		for(int i = 2; i < num;i++){
            if(num%i==0){
            	situacaoPrimo = true;
                return situacaoPrimo;
            }
		}
		return situacaoPrimo;
	}
	
	public static void exibirResulado(int n, boolean situacaoPrimo){
		if(situacaoPrimo ==  true){
			System.out.println("Numero primo.");
		}else
			System.out.println("Numero não é primo.");
		
	}
}
