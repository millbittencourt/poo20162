package ii.avaliacao.again;

import java.util.Date;

import ii.avaliacao.again.exceptions.SalarioNaoValidoException;

public abstract class Funcionarios {

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

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "Matrícula: " + getMatricula() + " |  Nome: " + getNome() + " |  Data de Admissao: " + getDataAdmissao()
				+ " |  Salário: " + getSalario();
	}

	public Funcionarios(Integer matricula, String nome, Date dataAdmissao, Double salario)
			throws SalarioNaoValidoException {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		if (salario <= 0 || salario > 30000) {
			SalarioNaoValidoException snv = new SalarioNaoValidoException();
			throw snv;
		}
		this.salario = salario;

	}
}
