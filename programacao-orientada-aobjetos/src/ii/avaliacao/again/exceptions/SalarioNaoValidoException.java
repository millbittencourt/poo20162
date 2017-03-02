package ii.avaliacao.again.exceptions;

public class SalarioNaoValidoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalarioNaoValidoException(){
System.out.println("Informe apenas salários válidos. Esse não é um salário válido. Apenas entre $1 e $30.000");	}
	
}
