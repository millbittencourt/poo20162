package ii.avaliacao.estude;

	import java.util.List;

import ii.avaliacao.estude.exceptions.SalarioNaoValidoException;

import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	public class ClasseClinica {
		private static List<Funcionarios> listaFun = new ArrayList<>();
		private static List<Medicos> clinicaMed = new ArrayList<>();
		
		public static void main(String[] args) throws SalarioNaoValidoException {
			cadastrarMedico();
			cadastrarEnfermeira();
			listarFuncionariosOrdenadoAnoAdmissaoSalario();
			listarFuncionariosOrdenadoMatricula();
			listarEspecialidadeValor();
			listarEspecialidades();
		}
		public static void cadastrarMedico() throws SalarioNaoValidoException{
			SalarioNaoValidoException sn = null;
			try {
		//		Medicos md = new Medicos(654, "Claudio", 2015, 15000d, "Endocrinologista", 1542);
			//	listaFun.add(md);
			} catch (SalarioNaoValidoException e) {
				e.printStackTrace();
				System.out.println("Salario não valido !!");				
			}
		}
		public static void cadastrarEnfermeira() throws SalarioNaoValidoException{
			try {
		//		Enfermeiras ef = new Enfermeiras(954, "Maria", 2013, 3145d, 7546);
//		1		listaFun.add(ef);
			} catch (SalarioNaoValidoException e) {
				e.printStackTrace();
			}
		}
		public static void listarFuncionariosOrdenadoAnoAdmissaoSalario(){
			Collections.sort(listaFun, new Comparator<Funcionarios>() {
				@Override
				public int compare(Funcionarios o1, Funcionarios o2) {
					return o1.getDataAdmissao().compareTo(o2.getDataAdmissao());
				}
			});

			System.out.println("\nCadastro, em ordem crescente de Ano de admissao:");
			for (Funcionarios clinica : listaFun) {
				System.out.println(clinica);
			}
//			Collections.sort(listaFun, new Comparator<Funcionarios>() {
//				@Override
//				public int compare(Funcionarios o1, Funcionarios o2) {
//					return o1.getSalario().compareTo(o2.getSalario());
//				}
//			});
//			System.out.println("\nCadastro, em ordem Crescente de Salario:");
//			for (Funcionarios clinica2 : listaFun) {
//				System.out.println(clinica2);
//			}
		}
		public static void listarFuncionariosOrdenadoMatricula(){
			Collections.sort(listaFun, new Comparator<Funcionarios>() {
				@Override
				public int compare(Funcionarios o1, Funcionarios o2) {
					return o1.getMatricula().compareTo(o2.getMatricula());
				}
			});
			System.out.println("\nCadastro, em Ordem Crescente de Matricula:");
			for (Funcionarios clinica : listaFun) {
				System.out.println(clinica);
			}
		}
		public static void listarEspecialidadeValor(){
//		Voce pode fazer isso caso queira ou pode pega pela lista que ele for pedir
			try {
				System.out.println();
				System.out.println("Listar Especialidade Valor");
//				Medicos md = new Medicos(654, "Claudio", 2015, 15000d, "Endocrinologista", 1542);
//				Medicos md1 = new Medicos(123, "Luis", 2014, 26000d, "Neurologista", 9854);
//				Medicos md2 = new Medicos(429, "Paulo", 2011, 10000d, "Obstetra", 4578);
//				md.toString();
//				md1.toString();
//				md2.toString();
			} catch (SalarioNaoValidoException e) {
				e.printStackTrace();
			}	
		}
		public static void listarEspecialidades() throws SalarioNaoValidoException{
			clinicaMed = new ArrayList<Medicos>();
			try {
//				Medicos md = new Medicos(654, "Claudio", 2015,0000d, "Endocrinologista", 1542);
//				clinicaMed.add(md);
			} catch (SalarioNaoValidoException e) {
				e.printStackTrace();
			}
			Collections.sort(clinicaMed, new Comparator<Medicos>() {
				@Override
				public int compare(Medicos o1, Medicos o2) {
					return o1.getEspecialidade().compareTo(o2.getEspecialidade());
				}
			});
			System.out.println("\nCadastro, em Ordem Crescente de Espacialidades:");
			for (Funcionarios clinica : clinicaMed) {
				System.out.println(clinica);
			}
		}

}
