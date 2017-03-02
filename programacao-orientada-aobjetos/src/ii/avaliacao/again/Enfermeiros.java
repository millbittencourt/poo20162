package ii.avaliacao.again;

import java.util.Date;

import ii.avaliacao.again.exceptions.SalarioNaoValidoException;

public class Enfermeiros extends Funcionarios {

	private Integer coren;

	public Integer getCoren() {
		return coren;
	}

	public void setCoren(Integer coren) {
		this.coren = coren;
	}

	public Enfermeiros(Integer matricula, String nome, Date dataAdmissao, Double salario, Integer coren)
			throws SalarioNaoValidoException {
		super(matricula, nome, dataAdmissao, salario);
		this.coren = coren;
	}

	@Override
	public String toString() {
		return "Matrícula: " + getMatricula() + " |  Nome: " + getNome() + " |  Data de Admissao: " + getDataAdmissao()
				+ " |  Salário: " + getSalario() + " |  Número do COREN: " + getCoren();
	}
}
