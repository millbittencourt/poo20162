
public class Professor extends Pessoa {

	public Professor(String nome, String telefone, TitulacaoEnum tipo) {
		super(nome);
		this.tipo = tipo;
		this.telefone =  telefone;
	}

	private TitulacaoEnum tipo;
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TitulacaoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TitulacaoEnum tipo) {
		this.tipo = tipo;
	}
}
