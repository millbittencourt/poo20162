
public class Aluno extends Pessoa {

	private Integer anoNascimento;
	private String escolaOrigem;
	private String telefone;

	public Aluno(String nome, String telefone, Integer anoNascimento, String escolaOrigem) {
		super(nome);
		this.anoNascimento = anoNascimento;
		this.escolaOrigem = escolaOrigem;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) throws anoNascimentoException {
		if (anoNascimento < 0) {
			throw new anoNascimentoException();
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
