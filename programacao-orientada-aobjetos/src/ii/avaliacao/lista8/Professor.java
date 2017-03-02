package ii.avaliacao.lista8;

public class Professor extends Pessoa{


	public Professor(String nome, Integer telefone, TitulacaoEnum titulacao) {
		super(nome, telefone);
		this.titulacao = titulacao;
	}

	private TitulacaoEnum titulacao;

	public TitulacaoEnum getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(TitulacaoEnum titulacao) {
		this.titulacao = titulacao;
	}
	
}
