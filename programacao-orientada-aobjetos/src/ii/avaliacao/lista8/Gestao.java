package ii.avaliacao.lista8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ii.avaliacao.lista8.exceptions.AnoNascimentoExceeption;
import ii.avaliacao.lista8.exceptions.TelefoneNaoInformadoException;

public class Gestao {

	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private List<Professor> listaProfessores = new ArrayList<Professor>();

	public void cadastrarProfessor(String nome, Integer telefone, TitulacaoEnum titulacao) {
		try {
			Professor prof = new Professor(nome, telefone, titulacao);
			listaProfessores.add(prof);
		} catch (TelefoneNaoInformadoException e) {
			e.printStackTrace();
		}

	}

	public void cadastrarAluno(String nome, Integer telefone, Integer anoNascimento, String escolaOrigem) {
		try {
			Aluno al = new Aluno(nome, telefone, anoNascimento, escolaOrigem);
			listaAlunos.add(al);
		} catch (AnoNascimentoExceeption ane) {
			ane.printStackTrace();
		}
	}

	}
