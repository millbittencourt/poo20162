package ii.avaliacao.estude.exceptions;

public class SalarioNaoValidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalarioNaoValidoException() {
		System.out.println("O sal�rio n�o corresponde com a faixa ( Entre 1 e 30000)");
	}
}
