package ii.avaliacao.estude;

import java.util.Date;

public class Medicos extends Funcionarios {

	public Medicos(Integer matricula, String nome, Date dataAdmissao, Double salario, String especialidade,
			Integer numCrm) {
		super(matricula, nome, dataAdmissao, salario);
		this.especialidade = especialidade;
		this.numCrm = numCrm;
	}

	private String especialidade;
	private Integer numCrm;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getNumCrm() {
		return numCrm;
	}

	public void setNumCrm(Integer numCrm) {
		this.numCrm = numCrm;
	}
@Override
	public String toString() {
		return "Mat: " + getMatricula() + ", nome: " + getNome() + ", data de admissao: " + getDataAdmissao()
				+ ", salario: " + getSalario() + ", especialidade: " + getEspecialidade() + ", CRM: " + getNumCrm();
	}
}
