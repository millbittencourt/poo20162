package ii.avaliacao.again.exceptions;

public class SalarioNaoValidoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalarioNaoValidoException(){
System.out.println("Informe apenas sal�rios v�lidos. Esse n�o � um sal�rio v�lido. Apenas entre $1 e $30.000");	}
	
}
