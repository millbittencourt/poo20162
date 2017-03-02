package ii.avaliacao.lista8;

public class Pessoa {

	private String nome;
	private Integer telefone;

	
	public Pessoa(String nome, Integer telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String toString(){
		return "Nome: "+getNome()+" |  Telefone: "+getTelefone();
	}
}
