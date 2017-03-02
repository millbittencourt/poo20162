package ii.avaliacao.again;

import java.util.Date;

import ii.avaliacao.again.exceptions.SalarioNaoValidoException;

public class Medicos extends Funcionarios {

	public Medicos(Integer matricula, String nome, Date dataAdmissao, Double salario, String especialidade, Integer crm)
			throws SalarioNaoValidoException {
		super(matricula, nome, dataAdmissao, salario);
		this.especialidade = especialidade;
		this.crm = crm;
	}

	private String especialidade;
	private Integer crm;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getCrm() {
		return crm;
	}

	public void setCrm(Integer crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Matrícula: " + getMatricula() + " |  Nome: " + getNome() + " |  Data de Admissao: " + getDataAdmissao()
				+ " |  Salário: " + getSalario() + " |  Especialidade: " + getEspecialidade() + " |  Número de CRM: "
				+ getCrm();

	}
}
