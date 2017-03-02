import java.util.ArrayList;

public class Gestao {

	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Professor> professores = new ArrayList<Professor>();

	public void cadastrarProfessor(String nome, String telefone, TitulacaoEnum tipo) {
		Professor prof = new Professor(nome, telefone, tipo);
		for (int i = 0; i < professores.size(); i++) {
			if (prof.getNome() != nome) {
				professores.add(prof);
			}
		}
	}

	public void cadastrarAluno(String nome, String telefone, Integer anoNascimento, String escolaOrigem) {
		Aluno alu = new Aluno(nome, telefone, anoNascimento, escolaOrigem);
		for (int i = 0; i < alunos.size(); i++) {
			if (alu.getNome() != nome) {
				alunos.add(alu);
			}
		}
		System.out.println(alu.getAnoNascimento() + alu.getEscolaOrigem() + alu.getNome());// aqui
																							// tem
																							// q
																							// ter
																							// uma
		// exceção
	}

}
