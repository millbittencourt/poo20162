package ii.avaliacao.lista8;

import ii.avaliacao.lista8.exceptions.AnoNascimentoExceeption;

public class Aluno extends Pessoa{

	public Aluno(String nome, Integer telefone, Integer anoNascimento, String escolaOrigem) {
		super(nome, telefone);
		this.anoNascimento = anoNascimento;
		this.escolaOrigem = escolaOrigem;
	}

	private Integer anoNascimento;
	private String escolaOrigem;

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		if (anoNascimento <= 0) {
			AnoNascimentoExceeption ane = new AnoNascimentoExceeption();
			throw ane;
		}
		this.anoNascimento = anoNascimento;
	}

	public String getEscolaOrigem() {
		return escolaOrigem;
	}

	public void setEscolaOrigem(String escolaOrigem) {
		this.escolaOrigem = escolaOrigem;
	}

}
