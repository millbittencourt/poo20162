package ii.avaliacao.estude;

import java.util.Date;

//import java.util.Date;

public class Enfermeiras extends Funcionarios {

	public Enfermeiras(Integer matricula, String nome, Date dataAdmissao, Double salario, Integer numCoren) {
		super(matricula, nome, dataAdmissao, salario);
		this.numCoren = numCoren;
	}

	private Integer numCoren;

	public Integer getNumCoren() {
		return numCoren;
	}

	public void setNumCoren(Integer numCoren) {
		this.numCoren = numCoren;
	}
@Override
	public String toString() {
		return "Mat: " + getMatricula() + ", nome: " + getNome() + ", data de admissao: " + getDataAdmissao()
				+ ", salario: " + getSalario()  + ", COREN: " + getNumCoren();
	}
}
