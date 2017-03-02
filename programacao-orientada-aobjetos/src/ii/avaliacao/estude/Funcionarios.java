package ii.avaliacao.estude;

import java.util.Date;

//import java.util.Date;

import ii.avaliacao.estude.exceptions.SalarioNaoValidoException;

public abstract class Funcionarios {

	public Funcionarios(Integer matricula, String nome, Date dataAdmissao, Double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	private Integer matricula;
	private String nome;
	private Date dataAdmissao;
	private Double salario;

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) throws SalarioNaoValidoException {
		if (salario <= 0 && salario > 30000) {
			throw new SalarioNaoValidoException();
		}
		this.salario = salario;
	}

	public String toString() {
		return "Mat: " + getMatricula() + ", nome: " + getNome() + ", data de admissao: " + getDataAdmissao()
				+ ", salario: " + getSalario();
	}
}
