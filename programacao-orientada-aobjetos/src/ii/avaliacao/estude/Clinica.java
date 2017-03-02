package ii.avaliacao.estude;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import ii.avaliacao.estude.exceptions.SalarioNaoValidoException;

public class Clinica {

	private static List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();
	private static List<Medicos> medicos = new ArrayList<Medicos>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	public static void main(String[] args) throws ParseException {
		cadastrarMedico(123, "Liz", sdf.parse("24.12.2015"), 8765d, "Dermatologia", 00231);
		cadastrarEnfermeira(154, "MARIA", sdf.parse("10.12.2015"), 2500d, 00756);
		cadastrarMedico(108, "Juau", sdf.parse("01.05.1999"), 5000d, "Otorrinolaringologia", 002);
		cadastrarMedico(052, "Jorge", sdf.parse("04.02.2005"), 5300d, "Cardiologia", 1359);

		listarFuncionariosOrdenadoDataAdmissao();
		listarFuncionariosOrdenadoMatricula();
		listarEspecialidades();
		listarEspecialidadeValor();

	}

	public static void cadastrarMedico(Integer matricula, String nome, Date dataAdmissao, Double salario,
			String especialidade, Integer numCrm) {
		try {
			Medicos med = new Medicos(matricula, nome, dataAdmissao, salario, especialidade, numCrm);
			funcionarios.add(med);
			medicos.add(med);
		} catch (SalarioNaoValidoException s) {
			s.printStackTrace();
			System.err.println("Salario not valid.");
		}
	}

	public static void cadastrarEnfermeira(Integer matricula, String nome, Date dataAdmissao, Double salario,
			Integer numCoren) {
		try {
			Enfermeiras enf = new Enfermeiras(matricula, nome, dataAdmissao, salario, numCoren);
			funcionarios.add(enf);
		} catch (SalarioNaoValidoException s) {
			s.printStackTrace();
			System.err.println("Salário n válido");
		}
	}

	public static void listarFuncionariosOrdenadoDataAdmissao() {
		Collections.sort(funcionarios, new Comparator<Funcionarios>() {
			public int compare(Funcionarios o1, Funcionarios o2) {
				return o1.getDataAdmissao().compareTo(o2.getDataAdmissao());
			}
		});

		System.out.println("Cadastro, em ordem crescente de data de admissao:");
		for (Funcionarios clinica : funcionarios) {
			System.out.println(clinica);
		}
	}

	public static void listarFuncionariosOrdenadoMatricula() {
		Collections.sort(funcionarios, new Comparator<Funcionarios>() {
			public int compare(Funcionarios o1, Funcionarios o2) {
				return o1.getMatricula().compareTo(o2.getMatricula());
			}
		});

		System.out.println("\nCadastro, em ordem crescente de matricula: ");
		for (Funcionarios clinica : funcionarios) {
			System.out.println(clinica);
		}
	}

	public static void listarEspecialidadeValor() {
		Collections.sort(medicos, new Comparator<Medicos>() {
			@Override
			public int compare(Medicos o1, Medicos o2) {
				return o1.getSalario().compareTo(o2.getSalario());
			}
		});
		System.out.println("\nEspecialidades em ordem de valor: ");
		String especialidade = null;
		for (Medicos meds : medicos) {
			if (!meds.getEspecialidade().equals(especialidade)) {
				System.out.println(meds.getEspecialidade() + "; valor: " + meds.getSalario());
				especialidade = meds.getEspecialidade();
			}
		}
	}

	public static void listarEspecialidades() {

		System.out.println("\nLista de especialidades:");
		String especialidade = null;
		for (Medicos meds : medicos) {
			if (!meds.getEspecialidade().equals(especialidade)) {
				System.out.println(meds.getEspecialidade());
				especialidade = meds.getEspecialidade();
			}
		}

	}
}