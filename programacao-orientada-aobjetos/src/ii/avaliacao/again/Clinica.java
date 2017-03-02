package ii.avaliacao.again;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Clinica {

	private static List<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();
	private static List<Medicos> listaMedicos = new ArrayList<Medicos>();
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

	public static void main(String[] args) throws ParseException {
		cadastrarEnfermeira(123, "tonha", sdf.parse("25.02.1997"), 2500d, 1698);
		cadastrarMedico(5269, "Alberto", sdf.parse("05.05.2005"), 5000d, "Geral", 4394);
		cadastrarMedico(1452, "Diogenes", sdf.parse("08.12.2015"), 7000d, "Socorrista", 859);
		cadastrarMedico(4396, "Melanie", sdf.parse("03.05.2005"), 10000d, "Neurologista", 3999);
		cadastrarEnfermeira(11563, "Maria Das Graças", sdf.parse("02.02.2010"), 1000d, 997);
		listarFuncionariosOrdenadoDataAdmissao();
		listarFuncionariosOrdenadoMatricula();
		listarEspecialidade();
		listarEspecialidadeValor();
	}

	public static void cadastrarMedico(Integer matricula, String nome, Date dataAdmissao, Double salario,
			String especialidade, Integer crm) {

		Medicos medico = new Medicos(matricula, nome, dataAdmissao, salario, especialidade, crm);
		listaFuncionarios.add(medico);
		listaMedicos.add(medico);
	}

	public static void cadastrarEnfermeira(Integer matricula, String nome, Date dataAdmissao, Double salario,
			Integer coren) {
		Enfermeiros enfermeiro = new Enfermeiros(matricula, nome, dataAdmissao, salario, coren);
		listaFuncionarios.add(enfermeiro);
	}

	public static void listarFuncionariosOrdenadoDataAdmissao() {
		Collections.sort(listaFuncionarios, new Comparator<Funcionarios>() {
			public int compare(Funcionarios f1, Funcionarios f2) {
				return f1.getDataAdmissao().compareTo(f2.getDataAdmissao());
			}
		});

		System.out.println("Cadastro em ordem de admissão: ");
		for (Funcionarios funcionarios : listaFuncionarios) {
			System.out.println(funcionarios);
		}
	}

	public static void listarFuncionariosOrdenadoMatricula() {
		Collections.sort(listaFuncionarios, new Comparator<Funcionarios>() {
			public int compare(Funcionarios f1, Funcionarios f2) {
				return f1.getMatricula().compareTo(f2.getMatricula());
			}
		});

		System.out.println("\nLista de funcionários em ordem de matrícula: ");
		for (Funcionarios funcionarios : listaFuncionarios) {
			System.out.println(funcionarios);
		}
	}

	public static void listarEspecialidadeValor() {
		Collections.sort(listaMedicos, new Comparator<Medicos>() {
			public int compare(Medicos m1, Medicos m2) {
				Double test = m2.getSalario();
				if (m1.getEspecialidade() == m2.getEspecialidade()) {
					if (m1.getSalario() > m2.getSalario())
						test = m1.getSalario();
				}
				return m1.getSalario().compareTo(test);
			}
		});

		System.out.println("\nLista de Especialidades por valor: ");
		for (Medicos medicos : listaMedicos) {
			System.out.println(medicos);
		}
	}

	public static void listarEspecialidade() {
		System.out.println("\nLista de especialidades: ");
		for (Medicos medicos : listaMedicos) {
			System.out.println(medicos.getEspecialidade());
		}
	}

}
