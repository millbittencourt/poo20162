package ii.avaliacao.lista8.exceptions;

public class AnoNascimentoExceeption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AnoNascimentoExceeption(){
		System.out.println("Digite um ano válido.");
	}
}
